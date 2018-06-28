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
</head>
<body>

<table class="tableStyle">
	<thead>
	<tr><th class="trStryle">材料ID</th><th class="trStryle">材料名</th><th class="trStryle">材料描述</th><th class="trStryle">材料价格</th></tr>
	</thead>
	<tbody>
	<c:forEach items="${stuffAlllist}" var="stuffItem" >
		<tr><td class="trStryle ellipise" title="${stuffItem.ID}">${stuffItem.ID}</td>
		<td class="trStryle ellipise" title="${stuffItem.name}">${stuffItem.name}</td>
		<td class="trStryle ellipise" title="${stuffItem.description}">${stuffItem.description}</td>
		<td class="trStryle ellipise" title="${stuffItem.pay}">${stuffItem.pay}</td></tr>
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