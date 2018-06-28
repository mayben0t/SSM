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
    	.layui-card-headerq{/* height:42px; */line-height:42px;padding:0 15px;border-bottom:1px solid #f6f6f6;color:#333;border-radius:2px 2px 0 0;font-size:14px;}
    </style>
</head>
<body>
<div class="layui-card-headerq">
<h3>温馨提示：完整的业务流程：公司收到预付款process1->设计师给出设计方案:process2->水电工施工process3->泥工施工process4->木工施工process5->漆工施工process6->竣工process7
<br/>完整的打款流程:用户选择合适的业务process1->用户预付定金process2->用户支付设计费用process3->用户支付水电工施工费用process4->用户支付泥工施工费用process5->用户支付木工施工费用process6->用户支付漆工施工费用process7
</h3></div>

<table class="tableStyle">
<thead>
	<tr><th class="trStryle" title="事务号">事务号</th><th class="trStryle hide" title="用户ID">用户ID</th><th class="trStryle" title="公司ID">公司ID</th><th class="trStryle" title="项目期限款(/元)">项目期限款(/元)</th><th class="trStryle" title="项目描述">项目描述</th><th class="trStryle" title="项目进度">项目进度</th><th class="trStryle" title="用户打款进度">用户打款进度</th><th class="trStryle" title="项目目前总款">项目目前总款</th><th class="trStryle" title="操作">操作</th></tr>
</thead>
<tbody>
	<c:forEach items="${transactionlist}" var="tra">
		<tr>
		<%-- <td>${ser.companyUserid}</td>
		<td class="trStryle ellipise" title="业务ID">${tra.description}</td> --%>
		<td class="trStryle ellipise" title="${tra.ID}">${tra.ID}</td>
		<td class="trStryle ellipise hide" title="${tra.userID}">${tra.userID}</td>
		<td class="trStryle ellipise" title="${tra.companyID}">${tra.companyID}</td>
		<td class="trStryle ellipise" title="${tra.money}">${tra.money}</td>
		<td class="trStryle ellipise" title="${tra.description}">${tra.description}</td>
		<td class="trStryle ellipise" title="${tra.progress}">${tra.progress}</td>
		<td class="trStryle ellipise" title="${tra.userConfirm}">${tra.userConfirm}</td>
		<td class="trStryle ellipise" title="${tra.total}">${tra.total}</td>
		<td class="trStryle ellipise" title="打款"><a href="${pageContext.request.contextPath}/trans/pay/${tra.ID}/${tra.money}?userConfirm=${tra.userConfirm}">打款</a></td>
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
<script src="/wangxiao/bootstrap-3.3.7-dist/js/jquery-1.11.0.js"></script>
<script>
	$(document).ready(
	function(){
		$(".hide").hide();
	}
);
</script>


</body>
</html>