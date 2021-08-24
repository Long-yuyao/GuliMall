$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'comment/list',
        datatype: "json",
        colModel: [			
			{ label: 'id', name: 'id', index: 'id', width: 50, key: true },
			{ label: 'sku_id', name: 'skuId', index: 'sku_id', width: 80 }, 			
			{ label: 'spu_id', name: 'spuId', index: 'spu_id', width: 80 }, 			
			{ label: '商品名字', name: 'spuName', index: 'spu_name', width: 80 }, 			
			{ label: '会员昵称', name: 'nickName', index: 'nick_name', width: 80 }, 			
			{ label: '星级', name: 'star', index: 'star', width: 80 }, 			
			{ label: '会员ip', name: 'ip', index: 'ip', width: 80 }, 			
			{ label: '创建时间', name: 'createTime', index: 'create_time', width: 80 }, 			
			{ label: '显示状态[0-不显示，1-显示]', name: 'status', index: 'status', width: 80 }, 			
			{ label: '购买时属性组合', name: 'spuAttributes', index: 'spu_attributes', width: 80 }, 			
			{ label: '点赞数', name: 'followCount', index: 'follow_count', width: 80 }, 			
			{ label: '回复数', name: 'replyCount', index: 'reply_count', width: 80 }, 			
			{ label: '评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]', name: 'resources', index: 'resources', width: 80 }, 			
			{ label: '内容', name: 'content', index: 'content', width: 80 }, 			
			{ label: '用户头像', name: 'icon', index: 'icon', width: 80 }, 			
			{ label: '评论类型[0 - 对商品的直接评论，1 - 对评论的回复]', name: 'type', index: 'type', width: 80 }			
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
		comment: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.comment = {};
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
			var url = vm.comment.id == null ? "comment/save" : "comment/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.comment),
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
				    url: baseURL + "comment/delete",
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
			$.get(baseURL + "comment/info/"+id, function(r){
                vm.comment = r.comment;
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