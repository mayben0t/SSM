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
    	.trStryle {
    		width: 11.5%!important;
    	}
    	
    </style>
</head>
<body>

<table class="tableStyle">
<thead>
	<tr><th class="trStryle" title="事务ID">事务ID</th><th class="trStryle" title="用户ID">用户ID</th><th class="trStryle" title="公司ID">公司ID</th><th class="trStryle" title="项目期限款(/元)">项目期限款(/元)</th><th class="trStryle" title="项目描述">项目描述</th><th class="trStryle" title="项目进度">项目进度</th><th class="trStryle" title="用户打款进度">用户打款进度</th><th class="trStryle" title="项目目前总款">项目目前总款</th><th class="trStryle" title="操作">操作</th></tr>
</thead>
<tbody>
	<c:forEach items="${companytrans}" var="tra">
		<tr>
		<%-- <td>${ser.companyUserid}</td>
		<td class="trStryle ellipise" title="业务ID">${tra.description}</td> --%>
		<td class="trStryle ellipise" title="${tra.ID}">${tra.ID}</td>
		<td class="trStryle ellipise" title="${tra.userID}">${tra.userID}</td>
		<td class="trStryle ellipise" title="${tra.companyID}">${tra.companyID}</td>
		<td class="trStryle ellipise" title="${tra.money}">${tra.money}</td>
		<td class="trStryle ellipise" title="${tra.description}">${tra.description}</td>
		<td class="trStryle ellipise" title="${tra.progress}">${tra.progress}</td>
		<td class="trStryle ellipise" title="${tra.userConfirm}">${tra.userConfirm}</td>
		<td class="trStryle ellipise" title="${tra.total}">${tra.total}</td>
		<td class="trStryle ellipise" title="修改进度"><a href="${pageContext.request.contextPath}/trans/update/${tra.ID}">修改进度</a>&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/trans/confirm/${tra.ID}">监工确认</a></td>
		<!-- <td class="trStryle ellipise" title="修改"></td> -->
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
<!-- <script>
	$(document).ready(function(){
		$("#insertservice").click(function(){
			window.location.href="${pageContext.request.contextPath}/jump/CompanyServiceInsert";  
		});
	});
</script> -->

</body>
</html>