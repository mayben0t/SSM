<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>layout 装饰公司信息管理系统（用户版） - Layui</title>
<link rel="stylesheet" href="/wangxiao/css/layui.css">
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<div class="layui-logo">装饰公司信息管理系统</div>
			<!-- 头部区域（可配合layui已有的水平导航） -->
			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item"><a href="">控制台</a></li>
				<li class="layui-nav-item"><a href="">商品管理</a></li>
				<li class="layui-nav-item"><a href="">用户</a></li>
				<li class="layui-nav-item"><a href="javascript:;">其它系统</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">邮件管理</a>
						</dd>
						<dd>
							<a href="">消息管理</a>
						</dd>
						<dd>
							<a href="">授权管理</a>
						</dd>
					</dl></li>
			</ul>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="javascript:;"> <img
						src="http://t.cn/RCzsdCq" class="layui-nav-img"> 贤心
				</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">基本资料</a>
						</dd>
						<dd>
							<a href="">安全设置</a>
						</dd>
					</dl></li>

			</ul>
		</div>

		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree" lay-filter="test">
					<!--<li class="layui-nav-item layui-nav-itemed">-->
					<!--<a class="" href="javascript:;">查看装饰业务/服务</a>-->
					<!--<dl class="layui-nav-child">-->
					<!--<dd><a href="javascript:;">列表一</a></dd>-->
					<!--<dd><a href="javascript:;">列表二</a></dd>-->
					<!--<dd><a href="javascript:;">列表三</a></dd>-->
					<!--<dd><a href="">超链接</a></dd>-->
					<!--</dl>-->
					<!--</li>-->
					<li class="layui-nav-item"><a href="${pageContext.request.contextPath}/work/userselectAll"
						target="frame">查看业务</a></li>
						<li class="layui-nav-item"><a href="${pageContext.request.contextPath}/stuff/userselectAll"
						target="frame">查看材料</a></li>
					<!--<li class="layui-nav-item">-->
					<!--<a href="javascript:;">当前进行的业务</a>-->
					<!--<dl class="layui-nav-child">-->
					<!--<dd><a href="javascript:;">业务一</a></dd>-->
					<!--<dd><a href="javascript:;">业务二</a></dd>-->
					<!--<dd><a href="">业务三</a></dd>-->
					<!--</dl>-->
					<!--</li>-->
					<li class="layui-nav-item"><a href="${pageContext.request.contextPath}/trans/selectbyuserid"
						target="frame">业务汇款</a></li>
					<li class="layui-nav-item"><a href="${pageContext.request.contextPath}/jump/connect"
						target="frame">联系我们</a></li>
					<!--<li class="layui-nav-item"><a href="">发布商品</a></li>-->
				</ul>
			</div>
		</div>

		<div class="layui-body">
			<!-- 内容主体区域 -->
			<iframe name="frame" frameborder="0"
				style="width: 100%; height: 100%;"></iframe>
		</div>

		<!--<div class="layui-footer">-->
		<!--&lt;!&ndash; 底部固定区域 &ndash;&gt;-->
		<!--© layui.com - 底部固定区域-->
		<!--</div>-->
	</div>
	<script src="/wangxiao/js/layui.js"></script>
	<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
</script>
</body>
</html>