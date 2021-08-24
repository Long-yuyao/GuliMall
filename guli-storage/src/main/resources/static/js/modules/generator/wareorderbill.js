$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'wareorderbill/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: 'order_id', name: 'orderId', index: 'order_id', width: 80 }, 			
			{ label: 'order_sn', name: 'orderSn', index: 'order_sn', width: 80 }, 			
			{ label: '收货人', name: 'consignee', index: 'consignee', width: 80 }, 			
			{ label: '收货人电话', name: 'consigneeTel', index: 'consignee_tel', width: 80 }, 			
			{ label: '配送地址', name: 'deliveryAddress', index: 'delivery_address', width: 80 }, 			
			{ label: '订单备注', name: 'orderComment', index: 'order_comment', width: 80 }, 			
			{ label: '付款方式【 1:在线付款 2:货到付款】', name: 'paymentWay', index: 'payment_way', width: 80 }, 			
			{ label: '任务状态', name: 'taskStatus', index: 'task_status', width: 80 }, 			
			{ label: '订单描述', name: 'orderBody', index: 'order_body', width: 80 }, 			
			{ label: '物流单号', name: 'trackingNo', index: 'tracking_no', width: 80 }, 			
			{ label: 'create_time', name: 'createTime', index: 'create_time', width: 80 }, 			
			{ label: '仓库id', name: 'wareId', index: 'ware_id', width: 80 }, 			
			{ label: '工作单备注', name: 'taskComment', index: 'task_comment', width: 80 }			
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
		wareOrderBill: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.wareOrderBill = {};
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
			var url = vm.wareOrderBill.id == null ? "wareorderbill/save" : "wareorderbill/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.wareOrderBill),
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
				    url: baseURL + "wareorderbill/delete",
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
			$.get(baseURL + "wareorderbill/info/"+id, function(r){
                vm.wareOrderBill = r.wareOrderBill;
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