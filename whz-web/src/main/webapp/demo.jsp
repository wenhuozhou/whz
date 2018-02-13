<%@ page contentType="text/html; charset=utf-8"%>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>凤巢系统</title>
    <link rel="stylesheet" type="text/css" href="<%=path%>/resources/bootstrap-3.3.7/css/bootstrap.min.css" >
	<link rel="stylesheet" type="text/css" href="<%=path%>/resources/font-awesome-4.7.0/css/font-awesome.min.css">

    <script src="<%=path%>/resources/jquery-easyui-1.5.4/jquery.min.js"></script>
    <script src="<%=path%>/resources/bootstrap-3.3.7/js/bootstrap.min.js"></script>
</head>
<body >
	<div class="container-fluid">
		<div class="btn-group" role="group" aria-label="...">
			<!-- 标准的按钮 -->
			<button type="button" class="btn btn-default">默认按钮</button>
			<!-- 提供额外的视觉效果，标识一组按钮中的原始动作 -->
			<button type="button" class="btn btn-primary">原始按钮</button>
			<!-- 表示一个成功的或积极的动作 -->
			<button type="button" class="btn btn-success">成功按钮</button>
			<!-- 信息警告消息的上下文按钮 -->
			<button type="button" class="btn btn-info">信息按钮</button>
			<!-- 表示应谨慎采取的动作 -->
			<button type="button" class="btn btn-warning">警告按钮</button>
			<!-- 表示一个危险的或潜在的负面动作 -->
			<button type="button" class="btn btn-danger">危险按钮</button>
			<!-- 并不强调是一个按钮，看起来像一个链接，但同时保持按钮的行为 -->
			<button type="button" class="btn btn-link">链接按钮</button>
		</div>


		<span class="fa-stack fa-lg">
		  <i class="fa fa-square-o fa-stack-2x"></i>
		  <i class="fa fa-twitter fa-stack-1x"></i>
		</span>
	
		<div class="btn-group" role="group" aria-label="...">
		  <button type="button" class="btn btn-default">Left</button>
		  <button type="button" class="btn btn-default">Middle</button>
		  <button type="button" class="btn btn-default">Right</button>
		</div>
		<form role="form">
		  <div class="form-group">
		    <label for="name">名称</label>
		    <input type="text" class="form-control" id="name" placeholder="请输入名称">
		    <label for="type">类型</label>
		    <input type="text" class="form-control" id="type" placeholder="请输入类型">
		  </div>
		  <div class="form-group">
		    <label for="inputfile">文件输入</label>
		    <input type="file" id="inputfile">
		    <p class="help-block">这里是块级帮助文本的实例。</p>
		  </div>
		  <div class="checkbox">
		    <label>
		      <input type="checkbox">请打勾
		    </label>
		  </div>
		  <button type="submit" class="btn btn-default">提交</button>
		</form>
		
		
		<br><br>
		<form class="form-inline" role="form">
		  <div class="form-group">
		    <label for="name">名称</label>
		    <input type="text" class="form-control" id="name" placeholder="请输入名称">
		  </div>
		  <div class="form-group">
		    <label for="name">名称</label>
		    <input type="text" class="form-control" id="name" placeholder="请输入名称">
		  </div>
		  <div class="form-group">
		    <label for="name">名称</label>
		    <input type="text" class="form-control" id="name" placeholder="请输入名称">
		  </div>
		  <div class="form-group">
		    <label for="name">名称</label>
		    <input type="text" class="form-control" id="name" placeholder="请输入名称">
		  </div>
		  <div class="form-group">
		    <label class="sr-only" for="inputfile">文件输入</label>
		    <input type="file" id="inputfile">
		  </div>
		  <div class="checkbox">
		    <label>
		      <input type="checkbox">请打勾
		    </label>
		  </div>
		  <button type="submit" class="btn btn-default">提交</button>
		</form>
		
		
		<br><br/>
		<form class="form-horizontal" role="form">
		  <div class="form-group">
		    <label for="firstname" class="col-sm-2 control-label">名字</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="firstname" placeholder="请输入名字">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="lastname" class="col-sm-2 control-label">姓</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" id="lastname" placeholder="请输入姓">
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <div class="checkbox">
		        <label>
		          <input type="checkbox">请记住我
		        </label>
		      </div>
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-default">登录</button>
		    </div>
		  </div>
		</form>
		
		<table class="table table-hover">
		  <caption>悬停表格布局</caption>
		  <thead>
		    <tr>
		      <th>名称</th>
		      <th>城市</th>
		      <th>邮编</th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr>
		      <td>Tanmay</td>
		      <td>Bangalore</td>
		      <td>560001</td>
		    </tr>
		    <tr>
		      <td>Sachin</td>
		      <td>Mumbai</td>
		      <td>400003</td>
		    </tr>
		    <tr>
		      <td>Uma</td>
		      <td>Pune</td>
		      <td>411027</td>
		    </tr>
		  </tbody>
		</table>
		
		
					<div id="win" class=" " title="添加用户" style="width:600px;height:600px" data-options="modal:true" >     
		       <div class="">
			       <form role="form">
					  <div class="form-group">
					    <label for="name">名称</label>
					    <input type="text" class="form-control" id="name" placeholder="请输入名称">
					  </div>
					  <div class="form-group">
					    <label for="type">类型</label>
					    <input type="text" class="form-control" id="type" placeholder="请输入类型">
					  </div>
					  <div class="form-group">
					    <label for="name">年龄</label>
					    <input type="text" class="form-control" id="name" placeholder="请输入名称">
					  </div>
					  <div class="form-group">
					    <label for="type">性别</label>
					    <input type="text" class="form-control" id="type" placeholder="请输入类型">
					  </div>
					  <div class="form-group">
					    <label for="name">年龄</label>
					    <input type="text" class="form-control" id="name" placeholder="请输入名称">
					  </div>
					  <div class="form-group">
					    <label for="type">性别</label>
					    <input type="text" class="form-control" id="type" placeholder="请输入类型">
					  </div>
					  <div class="form-group">
						  <button type="submit" class="btn btn-success">
						  	<i class="fa fa-wifi" aria-hidden="true"></i>保存
						  </button>
						  <button type="button" class="btn btn-danger">
						  	<i class="fa fa-window-close" aria-hidden="true"></i> 关闭
						  </button>
					  </div>
					</form> 
				</div>
	</div>
</body>
</html>
