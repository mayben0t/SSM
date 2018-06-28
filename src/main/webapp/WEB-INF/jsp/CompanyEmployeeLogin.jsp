<!-- 还需修改 基本没做 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>UserLogin</title>

<!-- Bootstrap -->
<link href="/wangxiao/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

<!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
<!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
<!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<div class="container">

		<form class="form-signin" action="${pageContext.request.contextPath}/Company/login" method="post">
			<h2 class="form-signin-heading">Please sign in(Company)</h2>
			<label for="CompanyID" class="sr-only">CompanyID</label> <input
				type="text" id="CompanyID" name="CompanyID" class="form-control"
				placeholder="CompanyID" required autofocus> <label
				for="inputPassword" class="sr-only">Password</label> <input
				type="password" id="inputPassword" class="form-control" name="password"
				placeholder="Password" required>
			<div class="checkbox">
				<!--<label>-->
				<!--<input type="checkbox" value="remember-me"> Remember me-->
				<!--</label>-->
			</div>
			<button class="btn btn-lg btn-primary" type="submit" id="signin">Sign
				in</button>
			<button class="btn btn-lg btn-primary" type="button" id="register" onclick="javascrtpt:window.location.href='${pageContext.request.contextPath}/jump/CompanyRegister'">Register</button>
		</form>
		<h3>
			I'm User, click <a href="${pageContext.request.contextPath}/jump/UserLogin">here</a> to login
		</h3>
	</div>
	<!-- /container -->




	<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
	<script src="/wangxiao/bootstrap-3.3.7-dist/js/jquery-1.11.0.js"></script>
	<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	<script src="/wangxiao/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<!-- <script>
    $(document).ready(function () {
        $("#register").click(function () {
            $(window).attr('location',"${pageContext.request.contextPath}CompanyRegister.jsp");
        });
    });
</script> -->
</body>
</html>