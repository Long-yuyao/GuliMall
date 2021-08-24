$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'orderreturnapply/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: 'order_id', name: 'orderId', index: 'order_id', width: 80 }, 			
			{ label: '退货商品id', name: 'skuId', index: 'sku_id', width: 80 }, 			
			{ label: '订单编号', name: 'orderSn', index: 'order_sn', width: 80 }, 			
			{ label: '申请时间', name: 'createTime', index: 'create_time', width: 80 }, 			
			{ label: '会员用户名', name: 'memberUsername', index: 'member_username', width: 80 }, 			
			{ label: '退款金额', name: 'returnAmount', index: 'return_amount', width: 80 }, 			
			{ label: '退货人姓名', name: 'returnName', index: 'return_name', width: 80 }, 			
			{ label: '退货人电话', name: 'returnPhone', index: 'return_phone', width: 80 }, 			
			{ label: '申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]', name: 'status', index: 'status', width: 80 }, 			
			{ label: '处理时间', name: 'handleTime', index: 'handle_time', width: 80 }, 			
			{ label: '商品图片', name: 'skuImg', index: 'sku_img', width: 80 }, 			
			{ label: '商品名称', name: 'skuName', index: 'sku_name', width: 80 }, 			
			{ label: '商品品牌', name: 'skuBrand', index: 'sku_brand', width: 80 }, 			
			{ label: '商品销售属性(JSON)', name: 'skuAttrsVals', index: 'sku_attrs_vals', width: 80 }, 			
			{ label: '退货数量', name: 'skuCount', index: 'sku_count', width: 80 }, 			
			{ label: '商品单价', name: 'skuPrice', index: 'sku_price', width: 80 }, 			
			{ label: '商品实际支付单价', name: 'skuRealPrice', index: 'sku_real_price', width: 80 }, 			
			{ label: '原因', name: 'reason', index: 'reason', width: 80 }, 			
			{ label: '描述', name: 'description述', index: 'description述', width: 80 }, 			
			{ label: '凭证图片，以逗号隔开', name: 'descPics', index: 'desc_pics', width: 80 }, 			
			{ label: '处理备注', name: 'handleNote', index: 'handle_note', width: 80 }, 			
			{ label: '处理人员', name: 'handleMan', index: 'handle_man', width: 80 }, 			
			{ label: '收货人', name: 'receiveMan', index: 'receive_man', width: 80 }, 			
			{ label: '收货时间', name: 'receiveTime', index: 'receive_time', width: 80 }, 			
			{ label: '收货备注', name: 'receiveNote', index: 'receive_note', width: 80 }, 			
			{ label: '收货电话', name: 'receivePhone', index: 'receive_phone', width: 80 }, 			
			{ label: '公司收货地址', name: 'receiveAddress', index: 'receive_address', width: 80 }			
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
		orderReturnApply: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.orderReturnApply = {};
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
			var url = vm.orderReturnApply.id == null ? "orderreturnapply/save" : "orderreturnapply/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.orderReturnApply),
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
				    url: baseURL + "orderreturnapply/delete",
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
			$.get(baseURL + "orderreturnapply/info/"+id, function(r){
                vm.orderReturnApply = r.orderReturnApply;
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