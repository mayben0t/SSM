<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/wangxiao/css/layui.css"  media="all">
    <link rel="stylesheet" href="/wangxiao/css/style.css">
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
    <style>
    	.bottonItem {
    		height: 40px;
    		line-height: 40px;
    		text-align: center;
    		background: #458B74;
    		color: #fff;
    		border-right: 1px solid #fff;
    	}
    	.layui-btn+.layui-btn {
    		margin-left: 0;
    	}
    </style>
</head>
<body>

<table class="tableStyle">
<thead>
	<tr><th class="trStryle" title="公司名">公司名</th><th class="trStryle" title="公司ID">公司ID</th><th class="trStryle" title="业务描述">业务描述</th><th class="trStryle" title="新增"><a href="${pageContext.request.contextPath}/work/insert">新增</a></th></tr>
</thead>
<tbody>
	<c:forEach items="${CompanyWork}" var="ser">
		<tr>
		<%-- <td>${ser.companyUserid}</td>
		<td class="trStryle ellipise" title="业务ID">${ser.description}</td> --%>
		<td class="trStryle ellipise" title="${ser.companyUserid}">${ser.companyUserid}</td>
		<td class="trStryle ellipise" title="${ser.companyID}">${ser.companyID}</td>
		<td class="trStryle ellipise" title="${ser.description}">${ser.description}</td>
		<td class="trStryle ellipise" title="修改"><a class="layui-btn layui-btn-sm layui-btn-normal" href="${pageContext.request.contextPath}/work/update/${ser.ID}">修改</a>
		&nbsp;&nbsp;&nbsp;<a class="layui-btn layui-btn-danger  layui-btn-sm" href="${pageContext.request.contextPath}/work/delete/${ser.ID}">删除</a></td>
		</tr>
	</c:forEach>
</tbody>
</table>
<!-- <div class="layui-row">
	<div class="layui-col-xs3 layui-btn">新增业务</div>
	<div class="layui-col-xs3 layui-btn">修改业务</div>
	<div class="layui-col-xs3 layui-btn">删除业务</div>
	<div class="layui-col-xs3 layui-btn">查询业务</div>
</div> -->
<!--<blockquote class="layui-elem-quote layui-quote-nm layui-text" style="margin-top: 15px;">-->
<!--<a href="http://fly.layui.com/jie/18737/" target="_blank">如果列宽自适应出现横向滚动条的解决方案</a>-->
<!--</blockquote>-->


<script src="/wangxiao/js/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
	$(document).ready(function(){
		$("#insertservice").click(function(){
			window.location.href="${pageContext.request.contextPath}/jump/CompanyServiceInsert";  
		});
	});
</script>

</body>
</html>