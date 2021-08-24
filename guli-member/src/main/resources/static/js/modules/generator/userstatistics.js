$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'userstatistics/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '用户id', name: 'userId', index: 'user_id', width: 80 }, 			
			{ label: '累计消费金额', name: 'consumeAmount', index: 'consume_amount', width: 80 }, 			
			{ label: '累计优惠金额', name: 'couponAmount', index: 'coupon_amount', width: 80 }, 			
			{ label: '订单数量', name: 'orderCount', index: 'order_count', width: 80 }, 			
			{ label: '优惠券数量', name: 'couponCount', index: 'coupon_count', width: 80 }, 			
			{ label: '评价数', name: 'commentCount', index: 'comment_count', width: 80 }, 			
			{ label: '退货数量', name: 'returnOrderCount', index: 'return_order_count', width: 80 }, 			
			{ label: '登录次数', name: 'loginCount', index: 'login_count', width: 80 }, 			
			{ label: '关注数量', name: 'attendCount', index: 'attend_count', width: 80 }, 			
			{ label: '粉丝数量', name: 'fansCount', index: 'fans_count', width: 80 }, 			
			{ label: '收藏的商品数量', name: 'collectProductCount', index: 'collect_product_count', width: 80 }, 			
			{ label: '收藏的专题活动数量', name: 'collectSubjectCount', index: 'collect_subject_count', width: 80 }, 			
			{ label: '收藏的评论数量', name: 'collectCommentCount', index: 'collect_comment_count', width: 80 }, 			
			{ label: '邀请的朋友数量', name: 'inviteFriendCount', index: 'invite_friend_count', width: 80 }			
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
		userStatistics: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.userStatistics = {};
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
			var url = vm.userStatistics.id == null ? "userstatistics/save" : "userstatistics/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.userStatistics),
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
				    url: baseURL + "userstatistics/delete",
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
			$.get(baseURL + "userstatistics/info/"+id, function(r){
                vm.userStatistics = r.userStatistics;
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