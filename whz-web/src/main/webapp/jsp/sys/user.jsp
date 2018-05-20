<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
	<script src="<%=path%>/jsp/sys/user.js"></script>
	<div class="layout-header">
		<button id="sys_user_search_btn" class="button button-royal button-rounded button-small"><i class="fa fa-search-minus"></i> 查询</button>
		<button id="sys_user_add_btn" class="button button-primary button-rounded button-small" ><i class="fa fa-plus"></i> 添加</button>
		<button id="sys_user_update_btn" class="button button-action button-rounded button-small" ><i class="fa fa-edit"></i> 修改</button>
		<button id="sys_user_delete_btn" class="button button-caution  button-rounded button-small" ><i class="fa fa-trash-o"></i> 删除</button>
		<hr>
		<form id="ff" method="post">   
		    <div class="form-row">
	    		<label for="account">用户账号 :</label>   
	        	<input id="sys_user_search_account" type="text" name="account" />   

	    		<label for="name">用户姓名:</label>   
	        	<input id="sys_user_search_name" type="text" name="name" />   
		    </div>          
	   </form>
	</div>
	<div class="layout-content">
		<table id="sys_user_grid"></table>
		
		<!-- 弹出窗体 -->
		<div id="sys_user_edit_win"  style="width:600px;height:500px;display: none;" >
			<form id="sys_user_form" method="post" class="bootstrap-frm">
				<label>
					<span>用户账号:</span>
					<input  type="text" name="account" placeholder="用户账号" class="easyui-validatebox"  data-options="required:true" />
				</label> 
				<label>
					<span>用户名 :</span>
					<input type="text" name="name"  placeholder="用户名"  class="easyui-validatebox" data-options="required:true"/>
				</label>
				<label>
					<span>描述 :</span>
					<textarea name="description" placeholder="描述"></textarea>
				</label>
			</form>
			<div class="window-footer">
				<button id="sys_user_save_btn" class="button button-action button-rounded button-small" ><i class="fa fa-edit"></i> 保存</button>
				<button class="closed button button-caution  button-rounded button-small" ><i class="fa fa-times"></i> 关闭</button>
			</div>  	  
		</div>  
	</div>	
</body>
</html>