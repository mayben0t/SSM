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
    <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
    <link rel="stylesheet" href="/wangxiao/css/style.css">
    <style>
    .trStryle {
    		width: 20%!important;
    	}
    </style>
</head>
<body>

<table class="tableStyle">
	<thead>
	<tr><th class="trStryle" title="业务ID">业务ID</th><th class="trStryle" title="公司ID">公司ID</th><th class="trStryle" title="公司名">公司名</th><th class="trStryle" title="业务描述">业务描述</th><th class="trStryle" title="操作">操作</th></tr>
	</thead>
	<tbody>
	<c:forEach items="${workAlllist}" var="workItem" >
		<tr><td class="trStryle ellipise" title="${workItem.ID}">${workItem.ID}</td>
		<td class="trStryle ellipise" title="${workItem.companyID}">${workItem.companyID}</td>
		<td class="trStryle ellipise" title="${workItem.companyUserid}">${workItem.companyUserid}</td>
		<td class="trStryle ellipise" title="${workItem.description}">${workItem.description}</td>
		<td class="trStryle ellipise" title="使用该业务"><a class="layui-btn layui-btn-normal layui-btn-radius" href="${pageContext.request.contextPath}/trans/insert/${sessionScope.UserID}/${workItem.companyID}/${workItem.description}">使用该业务</a></td></tr>
	</c:forEach>
	</tbody>
</table>

<!--<blockquote class="layui-elem-quote layui-quote-nm layui-text" style="margin-top: 15px;">-->
    <!--<a href="http://fly.layui.com/jie/18737/" target="_blank">如果列宽自适应出现横向滚动条的解决方案</a>-->
<!--</blockquote>-->


<script src="/wangxiao/js/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<!-- <script>
    layui.use('table', function(){
        var table = layui.table;

        table.render({
            elem: '#test'
            ,url:'/demo/table/user/'
            ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
            ,cols: [[
                {field:'id', title: 'ID', sort: true}
                ,{field:'companyid', title: '公司ID'} //width 支持：数字、百分比和不填写。你还可以通过 minWidth 参数局部定义当前单元格的最小宽度，layui 2.2.1 新增
                ,{field:'companyuserid', title: '公司名'}
                ,{field:'description', title: '描述'}
            ]]
        });
    });
</script> -->

</body>
</html>