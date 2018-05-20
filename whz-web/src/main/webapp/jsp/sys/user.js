var User ={
	
	init:function(){
		this.bindEvent();
		this.initUserGrid();
	},
	
	/**
	 * 绑定事件函数
	 */
	bindEvent:function(){
		/**
		 * 搜索用户
		 */
		$("#sys_user_search_btn").click(function(){
			User.searchUser();
		});
		
		/**
		 * 打开添加用户窗体
		 */
		$("#sys_user_add_btn").click(function(){
			$('#sys_user_edit_win').window({
				title:"添加用户",
			    modal:true,
			    collapsible:false,
			    minimizable:false
			});
			$("#sys_user_form").form('reset');
			$('#sys_user_edit_win').window('open');
			
			$("#sys_user_save_btn").unbind().click(function(){
				$('#sys_user_form').form('submit', {    
				    url:"user/insert",	 
				    onSubmit: function(){    
				    	return $(this).form('validate');   
				    },    
				    success:function(data){
				    	data = $.parseJSON(data);
				    	if(data.success){
				    		Utils.info(data.message);
					        $('#sys_user_edit_win').window('close'); 
					        User.searchUser();
				    	}else{
				    		Utils.warning(data.message);
				    	}
				    }    
				}); 
			});
		});

		
		
		
		/**
		 * 打开修改用户窗体
		 */
		$("#sys_user_update_btn").click(function(){
			var row = $('#sys_user_grid').datagrid("getSelected");
			if(!row){
				Utils.warning(MessageConstant.NO_SELECTED_DATA);
				return;
			}
			$('#sys_user_edit_win').window({
				title:"修改用户",
			    modal:true,
			    collapsible:false,
			    minimizable:false
			});
			$("#sys_user_form").form('load',row);
			$('#sys_user_edit_win').window('open');
			
			$("#sys_user_save_btn").unbind().click(function(){
				$('#sys_user_form').form('submit', {    
				    url:"user/update",
				    queryParams:{"id":row.id},
				    onSubmit: function(){    
				    	return $(this).form('validate');   
				    },    
				    success:function(data){
				    	data = $.parseJSON(data);
				    	if(data.success){
				    		Utils.info(data.message);
					        $('#sys_user_edit_win').window('close'); 
					        User.searchUser();
				    	}else{
				    		Utils.warning(data.message);
				    	}
				    }    
				}); 
			});
		});
		
		
		/**
		 * 删除用户
		 */
		$("#sys_user_delete_btn").click(function(){
			User.deleteUser();
		});
		
		/**
		 * 窗体关闭
		 */
		$(".window-footer button.closed").on('click' ,function(){
			$(this).parent().parent().window('close');
		});
		
	},
	
	/**
	 * 实例化用户数据表格
	 */
	initUserGrid:function(){
		$('#sys_user_grid').datagrid({    
		    url:'user/list',
		    pagination:true,
		    fit:true,
		    rownumbers:true,
		    singleSelect:true,
		    columns:[[    
		        {field:'account',title:'用户账号',width:400},    
		        {field:'name',title:'用户姓名',width:400},    
		        {field:'description',title:'描述',width:400}    
		    ]]    
		}); 
	},
	
	/**
	 * 查询用户
	 */
	searchUser:function(){
		var params ={};
		var account = $("#sys_user_search_account").val().trim();
		var name = $("#sys_user_search_name").val().trim();
		params["account"] = account;
		params["name"] = name;
		$('#sys_user_grid').datagrid('load',params);
	},
	
	/**
	 * 删除用户
	 */
	deleteUser:function(){
		var row = $('#sys_user_grid').datagrid("getSelected");
		if(!row){
			Utils.warning(MessageConstant.NO_SELECTED_DATA);
			return;
		}
		Utils.confirm("是否要删除所选择的用户数据？", function(){
			Utils.ajax("user/delete", {id:row.id},function(data){
				User.searchUser();
			});
		});
	}
	
		
};

$(function(){ 
	User.init();
	$.extend($.fn.validatebox.defaults.rules, {    
	    equals: {    
	        validator: function(value,param){    
	            return value == $(param[0]).val();    
	        },    
	        message: 'Field do not match.'   
	    }    
	}); 
}); 