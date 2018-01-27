<%@ page contentType="text/html; charset=utf-8"%>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>凤巢系统</title>
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/css/login/style.css" />
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/css/login/body.css" />
<link rel="stylesheet" type="text/css" href="<%=path%>/resources/css/login/login.css" />
</head>
<body>
	<div class="container">
		<div id="content">
			<div>
				<img class="rotation my_img" src="<%=path%>/resources/images/login/black_hole.jpg" width="90" height="90"/>
			</div>
			<form id="loginForm" onsubmit="return login()" method="post">
				<h1>凤巢系统</h1>
				<div>
					<input type="text" name="username" placeholder="用户名" required="" id="username" />
				</div>
				<div>
					<input type="password" name="password" placeholder="密码" required="" id="password" />
				</div>
				<div>
					<input type="text" name="checkedcode" placeholder="验证码" required="" id="checkedcode" />
				</div>
				<div class="login_error_tips" >
					<span class="help-block u-errormessage" id="js-server-helpinfo">&nbsp;</span>
				</div>
				<div>
					<input type="submit" value="登录" class="btn btn-primary"/>
				</div>
			</form>
			<div class="button">
				<a href="#">@whz版权所有</a>
			</div>
	    </div>
	</div>
</body>
</html>