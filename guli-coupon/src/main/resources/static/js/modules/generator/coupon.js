$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'coupon/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '优惠卷类型[0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券]', name: 'couponType', index: 'coupon_type', width: 80 }, 			
			{ label: '优惠券图片', name: 'couponImg', index: 'coupon_img', width: 80 }, 			
			{ label: '优惠卷名字', name: 'couponName', index: 'coupon_name', width: 80 }, 			
			{ label: '数量', name: 'num', index: 'num', width: 80 }, 			
			{ label: '金额', name: 'amount', index: 'amount', width: 80 }, 			
			{ label: '每人限领张数', name: 'perLimit', index: 'per_limit', width: 80 }, 			
			{ label: '使用门槛', name: 'minPoint', index: 'min_point', width: 80 }, 			
			{ label: '开始时间', name: 'startTime', index: 'start_time', width: 80 }, 			
			{ label: '结束时间', name: 'endTime', index: 'end_time', width: 80 }, 			
			{ label: '使用类型[0->全场通用；1->指定分类；2->指定商品]', name: 'useType', index: 'use_type', width: 80 }, 			
			{ label: '备注', name: 'note', index: 'note', width: 80 }, 			
			{ label: '发行数量', name: 'publishCount', index: 'publish_count', width: 80 }, 			
			{ label: '已使用数量', name: 'useCount', index: 'use_count', width: 80 }, 			
			{ label: '领取数量', name: 'receiveCount', index: 'receive_count', width: 80 }, 			
			{ label: '可以领取的开始日期', name: 'enableStartTime', index: 'enable_start_time', width: 80 }, 			
			{ label: '可以领取的结束日期', name: 'enableEndTime', index: 'enable_end_time', width: 80 }, 			
			{ label: '优惠码', name: 'code', index: 'code', width: 80 }, 			
			{ label: '可以领取的会员等级[0->不限等级，其他-对应等级]', name: 'memberLevel', index: 'member_level', width: 80 }, 			
			{ label: '发布状态[0-未发布，1-已发布]', name: 'publish', index: 'publish', width: 80 }			
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
		coupon: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.coupon = {};
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
			var url = vm.coupon.id == null ? "coupon/save" : "coupon/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.coupon),
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
				    url: baseURL + "coupon/delete",
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
			$.get(baseURL + "coupon/info/"+id, function(r){
                vm.coupon = r.coupon;
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