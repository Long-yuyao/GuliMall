$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'attr/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: '属性名', name: 'name', index: 'name', width: 80 }, 			
			{ label: '是否需要检索[0-不需要，1-需要]', name: 'searchType', index: 'search_type', width: 80 }, 			
			{ label: '属性图标', name: 'icon', index: 'icon', width: 80 }, 			
			{ label: '可选值列表[用逗号分隔]', name: 'valueSelect', index: 'value_select', width: 80 }, 			
			{ label: '属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]', name: 'type', index: 'type', width: 80 }, 			
			{ label: '启用状态[0 - 禁用，1 - 启用]', name: 'enable', index: 'enable', width: 80 }, 			
			{ label: '快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整', name: 'showDesc', index: 'show_desc', width: 80 }, 			
			{ label: '所属分类', name: 'categoryId', index: 'category_id', width: 80 }, 			
			{ label: '规格分组id', name: 'groupId', index: 'group_id', width: 80 }			
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
		attr: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.attr = {};
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
			var url = vm.attr.id == null ? "attr/save" : "attr/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.attr),
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
				    url: baseURL + "attr/delete",
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
			$.get(baseURL + "attr/info/"+id, function(r){
                vm.attr = r.attr;
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