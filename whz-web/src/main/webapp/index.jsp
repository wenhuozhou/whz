<%@ page contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<title>凤巢系统</title>
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/jquery-easyui-1.5.4/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/font-awesome-4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/jquery-confirm/jquery-confirm.min.css">
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/css/buttons.css">
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/css/form.css">
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/css/layout.css">

<script src="<%=path%>/resources/jquery-easyui-1.5.4/jquery.min.js"></script>
<script src="<%=path%>/resources/jquery-easyui-1.5.4/jquery.easyui.min.js"></script>
<script src="<%=path%>/resources/jquery-easyui-1.5.4/easyui-lang-zh_CN.js"></script>
<script src="<%=path%>/resources/jquery-confirm/jquery-confirm.min.js"></script>
<script src="<%=path%>/resources/js/constant.js"></script>
<script src="<%=path%>/resources/js/index.js"></script>
<script src="<%=path%>/resources/js/utils.js"></script>

</head>
<body class="easyui-layout" data-options="fit:true">
	<div data-options="region:'north'" style="height: 60px; background: rgb(4,158,196);">555</div>
	<div data-options="region:'west',title:'我的菜单',split:true" style="width: 180px;">
		<ul id="main_menu" class="easyui-tree">
			<li><span>Folder</span></li>
			<li><span>File21</span></li>
		</ul>
	</div>
	<div data-options="region:'center'">
		<div id="main_context" class="easyui-tabs" style="height: 100%">
			<div title="主页">
				<div class="divblock">
					  <button class="button button-primary button-rounded button-small" >添加</button>
					  <button class="button button-action button-rounded button-small" >修改</button>
					  <button class="button button-caution  button-rounded button-small" >删除</button>  
				</div>
			</div>
		</div>
	</div>
</body>
</html>
