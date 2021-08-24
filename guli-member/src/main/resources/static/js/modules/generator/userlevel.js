$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'userlevel/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '等级名称', name: 'name', index: 'name', width: 80 }, 			
			{ label: '等级需要的成长值', name: 'growthPoint', index: 'growth_point', width: 80 }, 			
			{ label: '默认等级', name: 'defaultStatus', index: 'default_status', width: 80 }, 			
			{ label: '免运费标准', name: 'freeFreightPoint', index: 'free_freight_point', width: 80 }, 			
			{ label: '每次评价获取的成长值', name: 'commentGrowthPoint', index: 'comment_growth_point', width: 80 }, 			
			{ label: '是否有免邮特权', name: 'priviledgeFreeFreight', index: 'priviledge_free_freight', width: 80 }, 			
			{ label: '是否有会员价格特权', name: 'priviledgeMemberPrice', index: 'priviledge_member_price', width: 80 }, 			
			{ label: '是否有生日特权', name: 'priviledgeBirthday', index: 'priviledge_birthday', width: 80 }, 			
			{ label: '备注', name: 'remark', index: 'remark', width: 80 }			
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
		userLevel: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.userLevel = {};
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
			var url = vm.userLevel.id == null ? "userlevel/save" : "userlevel/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.userLevel),
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
				    url: baseURL + "userlevel/delete",
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
			$.get(baseURL + "userlevel/info/"+id, function(r){
                vm.userLevel = r.userLevel;
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