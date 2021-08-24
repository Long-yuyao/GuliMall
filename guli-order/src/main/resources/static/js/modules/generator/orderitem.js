$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'orderitem/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: 'order_id', name: 'orderId', index: 'order_id', width: 80 }, 			
			{ label: 'order_sn', name: 'orderSn', index: 'order_sn', width: 80 }, 			
			{ label: 'spu_id', name: 'spuId', index: 'spu_id', width: 80 }, 			
			{ label: 'spu_name', name: 'spuName', index: 'spu_name', width: 80 }, 			
			{ label: 'spu_pic', name: 'spuPic', index: 'spu_pic', width: 80 }, 			
			{ label: '品牌', name: 'spuBrand', index: 'spu_brand', width: 80 }, 			
			{ label: '商品分类id', name: 'categoryId', index: 'category_id', width: 80 }, 			
			{ label: '商品sku编号', name: 'skuId', index: 'sku_id', width: 80 }, 			
			{ label: '商品sku名字', name: 'skuName', index: 'sku_name', width: 80 }, 			
			{ label: '商品sku图片', name: 'skuPic', index: 'sku_pic', width: 80 }, 			
			{ label: '商品sku价格', name: 'skuPrice', index: 'sku_price', width: 80 }, 			
			{ label: '商品购买的数量', name: 'skuQuantity', index: 'sku_quantity', width: 80 }, 			
			{ label: '商品销售属性组合（JSON）', name: 'skuAttrsVals', index: 'sku_attrs_vals', width: 80 }, 			
			{ label: '商品促销分解金额', name: 'promotionAmount', index: 'promotion_amount', width: 80 }, 			
			{ label: '优惠券优惠分解金额', name: 'couponAmount', index: 'coupon_amount', width: 80 }, 			
			{ label: '积分优惠分解金额', name: 'integrationAmount', index: 'integration_amount', width: 80 }, 			
			{ label: '该商品经过优惠后的分解金额', name: 'realAmount', index: 'real_amount', width: 80 }, 			
			{ label: '赠送积分', name: 'giftIntegration', index: 'gift_integration', width: 80 }, 			
			{ label: '赠送成长值', name: 'giftGrowth', index: 'gift_growth', width: 80 }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		orderItem: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.orderItem = {};
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
			var url = vm.orderItem.id == null ? "orderitem/save" : "orderitem/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.orderItem),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var ids = getSelectedRows();
			if(ids == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "orderitem/delete",
                    contentType: "application/json",
				    data: JSON.stringify(ids),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(id){
			$.get(baseURL + "orderitem/info/"+id, function(r){
                vm.orderItem = r.orderItem;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});