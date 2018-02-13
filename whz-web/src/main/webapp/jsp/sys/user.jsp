<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
	<div style="padding-top: 3px;padding-left: 5px; border:1px solid;">
		<button class="button button-royal button-rounded button-small"><i class="fa fa-search-minus"></i> 查询</button>
		<button class="button button-primary button-rounded button-small" ><i class="fa fa-plus"></i> 添加</button>
		<button class="button button-action button-rounded button-small" ><i class="fa fa-edit"></i> 修改</button>
		<button class="button button-caution  button-rounded button-small" ><i class="fa fa-trash-o"></i> 删除</button>
	</div>
	<div style="padding:10px;">
		<label>用户名</label><input  class="easyui-textbox" type="text"/>
		<label>账号</label><input class="easyui-textbox" type="text"/>
		<label>用户名</label><input class="easyui-textbox" type="text"/>
		<label>账号</label><input class="easyui-textbox" type="text"/>
		<label>用户名</label><input class="easyui-textbox" type="text"/>
		<label>账号</label><input  class="easyui-textbox" type="text"/>
		<label>用户名</label><input class="easyui-textbox" type="text"/>
		<label>账号</label><input  class="easyui-textbox" type="text"/>
	</div>
	<table class="easyui-datagrid">
		<thead>
			<tr>
				<th data-options="field:'code'">编码</th>
				<th data-options="field:'name'">名称</th>
				<th data-options="field:'price'">价格</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>001</td>
				<td>name1</td>
				<td>2323</td>
			</tr>
			<tr>
				<td>002</td>
				<td>name2</td>
				<td>4612</td>
			</tr>
		</tbody>
	</table>
</body>
</html>