
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="/wangxiao/bootstrap-3.3.7-dist/js/jquery-1.11.0.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="/wangxiao/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<!-- <script>
    $(document).ready(function () {
        $("#register").click(function () {
            $(window).attr('location',"/WEB-INF/UserRegister.jsp");
        });
    });
</script> -->
</body>
</html>

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
    <link rel="stylesheet" href="/wangxiao/css/layui.css"  media="all">
  	<style>
  		html {
  			width: 100%;
  			height: 100%;
  		}
  		/* .loginBg {
  			margin-top: 10%;
  			background-image: url("/wangxiao/images/login/timg.jpg");
  			background-size: 100% 100%; 
  			background-repeat: no-repeat;
  		} */
  		
  		.layui-input, .layui-textarea {
		    display: block;
		    width: 300px;
		    padding-left: 10px;
		}
		
		.layui-form select {
			display: block;
			width: 300px;
			height: 38px;
		}
		
		.layui-form select>option {
			height: 38px;
		}
		
		.formActive {
			padding: 40px;
			margin: 10% auto;
			width: 520px;
			border: 2px solid #009688;
			border-radius: 10px;
			box-shadow: 0 0 30px #636363,
						0 0 30px #668B8B;
  		}
  	</style>

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="loginBg">
<form class="layui-form formActive" action="${pageContext.request.contextPath}/companyuser/login" 
method="post">
	<div class="layui-form-item">
    <label class="layui-form-label">公司ID：</label>
    <div class="layui-input-block">
      <input type="text" name="companyID" required  lay-verify="required" placeholder="请输入公司ID" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">员工账号：</label>
    <div class="layui-input-block">
      <input type="text" name="username" required  lay-verify="required" placeholder="请输入员工账号" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">密码：</label>
    <div class="layui-input-block">
      <input type="password" name="password" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
  </div>
    <div class="layui-form-item">
    <label class="layui-form-label">选择框</label>
    <div class="layui-input-block">
      <select name="type" lay-verify="required">
        <option value="">请选择</option>
        <option value="0">总监</option>
        <option value="1">项目经理</option>
        <option value="2">设计师</option>
        <option value="3">水电工</option>
        <option value="4">泥工</option>
        <option value="5">木工</option>
        <option value="6">漆工</option>
      </select>
    </div>
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>


<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="/wangxiao/bootstrap-3.3.7-dist/js/jquery-1.11.0.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="/wangxiao/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<!-- <script>
    $(document).ready(function () {
        $("#register").click(function () {
            $(window).attr('location',"/WEB-INF/UserRegister.jsp");
        });
    });
</script> -->
</body>
</html>