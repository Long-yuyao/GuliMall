$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'order/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: 'member_id', name: 'userId', index: 'user_id', width: 80 }, 			
			{ label: '订单号', name: 'orderSn', index: 'order_sn', width: 80 }, 			
			{ label: '使用的优惠券', name: 'couponId', index: 'coupon_id', width: 80 }, 			
			{ label: '创建时间', name: 'createTime', index: 'create_time', width: 80 }, 			
			{ label: '用户名', name: 'username', index: 'username', width: 80 }, 			
			{ label: '订单总额', name: 'totalAmount', index: 'total_amount', width: 80 }, 			
			{ label: '应付总额', name: 'payAmount', index: 'pay_amount', width: 80 }, 			
			{ label: '运费金额', name: 'freightAmount', index: 'freight_amount', width: 80 }, 			
			{ label: '促销优化金额（促销价、满减、阶梯价）', name: 'promotionAmount', index: 'promotion_amount', width: 80 }, 			
			{ label: '积分抵扣金额', name: 'integrationAmount', index: 'integration_amount', width: 80 }, 			
			{ label: '优惠券抵扣金额', name: 'couponAmount', index: 'coupon_amount', width: 80 }, 			
			{ label: '后台调整订单使用的折扣金额', name: 'discountAmount', index: 'discount_amount', width: 80 }, 			
			{ label: '支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】', name: 'payType', index: 'pay_type', width: 80 }, 			
			{ label: '订单来源[0->PC订单；1->app订单]', name: 'sourceType', index: 'source_type', width: 80 }, 			
			{ label: '订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】', name: 'status', index: 'status', width: 80 }, 			
			{ label: '物流公司(配送方式)', name: 'deliveryCompany', index: 'delivery_company', width: 80 }, 			
			{ label: '物流单号', name: 'deliverySn', index: 'delivery_sn', width: 80 }, 			
			{ label: '自动确认时间（天）', name: 'autoConfirmDay', index: 'auto_confirm_day', width: 80 }, 			
			{ label: '可以获得的积分', name: 'integration', index: 'integration', width: 80 }, 			
			{ label: '可以获得的成长值', name: 'growth', index: 'growth', width: 80 }, 			
			{ label: '发票类型[0->不开发票；1->电子发票；2->纸质发票]', name: 'billType', index: 'bill_type', width: 80 }, 			
			{ label: '发票抬头', name: 'billHeader', index: 'bill_header', width: 80 }, 			
			{ label: '发票内容', name: 'billContent', index: 'bill_content', width: 80 }, 			
			{ label: '收票人电话', name: 'billReceiverPhone', index: 'bill_receiver_phone', width: 80 }, 			
			{ label: '收票人邮箱', name: 'billReceiverEmail', index: 'bill_receiver_email', width: 80 }, 			
			{ label: '收货人姓名', name: 'receiverName', index: 'receiver_name', width: 80 }, 			
			{ label: '收货人电话', name: 'receiverPhone', index: 'receiver_phone', width: 80 }, 			
			{ label: '收货人邮编', name: 'receiverPostCode', index: 'receiver_post_code', width: 80 }, 			
			{ label: '省份/直辖市', name: 'receiverProvince', index: 'receiver_province', width: 80 }, 			
			{ label: '城市', name: 'receiverCity', index: 'receiver_city', width: 80 }, 			
			{ label: '区', name: 'receiverRegion', index: 'receiver_region', width: 80 }, 			
			{ label: '详细地址', name: 'receiverAddress', index: 'receiver_address', width: 80 }, 			
			{ label: '确认收货状态[0->未确认；1->已确认]', name: 'confirmStatus', index: 'confirm_status', width: 80 }, 			
			{ label: '删除状态【0->未删除；1->已删除】', name: 'deleteStatus', index: 'delete_status', width: 80 }, 			
			{ label: '下单时使用的积分', name: 'useIntegration', index: 'use_integration', width: 80 }, 			
			{ label: '支付时间', name: 'paymentTime', index: 'payment_time', width: 80 }, 			
			{ label: '发货时间', name: 'deliveryTime', index: 'delivery_time', width: 80 }, 			
			{ label: '确认收货时间', name: 'receiveTime', index: 'receive_time', width: 80 }, 			
			{ label: '评价时间', name: 'commentTime', index: 'comment_time', width: 80 }, 			
			{ label: '修改时间', name: 'modifyTime', index: 'modify_time', width: 80 }, 			
			{ label: '订单备注', name: 'remark', index: 'remark', width: 80 }			
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
		order: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.order = {};
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
			var url = vm.order.id == null ? "order/save" : "order/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.order),
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
				    url: baseURL + "order/delete",
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
			$.get(baseURL + "order/info/"+id, function(r){
                vm.order = r.order;
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