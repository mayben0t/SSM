<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title></title>

    <!-- Bootstrap -->
    <link href="/wangxiao/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/wangxiao/css/layui.css"  media="all">
    <style>
    	.layui-form-label {
		    width: 111px;
		}
    	
    	.buttonSubmit {
    		width: 100px;
		    height: 38px;
		    border: 0;
		    background: #red;
		    background: #009688;
		    color: #fff;
		    border-radius: 7px;
    	}
    	
    	.layui-input, .layui-textarea {
    		width: 400px;
    	}
    </style>
</head>
<body>
<c:choose>
<c:when test="${updatestuff!=null}">
<form class="layui-form" action="${pageContext.request.contextPath}/stuff/updateComplete/${updatestuff.ID}"
				method="post" style="margin-top: 30px">
	<%--   <div class="layui-form-item">
	    <label class="layui-form-label">公司ID：</label>
	    <div class="layui-input-block">
	      <input type="text" name="companyID" required  lay-verify="required" placeholder="请输入公司ID" autocomplete="off" class="layui-input" enabled="true" value="${updatework.companyID}">
	    </div>
	  </div> --%>
	  <div class="layui-form-item">
	    <label class="layui-form-label">材料名：</label>
	    <div class="layui-input-block">
	      <input type="text" name="stuffname" required lay-verify="required" placeholder="请输入材料名" autocomplete="off" class="layui-input"  value="${updatestuff.name}">
	    </div>
	  </div>
	  <div class="layui-form-item layui-form-text">
	    <label class="layui-form-label">材料描述：</label>
	    <div class="layui-input-block">
	      <textarea name="stuffdescription" placeholder="请输入材料描述" class="layui-textarea">${updatestuff.description}</textarea>
	    </div>
	  </div>
	  <div class="layui-form-item layui-form-text">
	    <label class="layui-form-label">材料价格：</label>
	    <div class="layui-input-block">
	      <input type="text" name="stuffpay" required lay-verify="required" placeholder="请输入材料价格" autocomplete="off" class="layui-input"  value="${updatestuff.pay}">
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <div class="layui-input-block">
	      <input class="buttonSubmit" type="submit" value="修改保存" />
	    </div>
	  </div>
	</form>
</c:when>
<c:otherwise>
	<form class="layui-form" action="${pageContext.request.contextPath}/stuff/insertcomplete"
				method="post" style="margin-top: 30px">
	  <%-- <div class="layui-form-item">
	    <label class="layui-form-label">公司ID：</label>
	    <div class="layui-input-block">
	      <input type="text" name="companyidinsert"  lay-verify="required" placeholder="请输入公司ID" autocomplete="off" class="layui-input" value="${sessionScope.CompanyID}" readonly/>
	    </div>
	  </div> --%>
	  <div class="layui-form-item">
	    <label class="layui-form-label">材料名：</label>
	    <div class="layui-input-block">
	      <input type="text" name="stuffnameinsert" lay-verify="required" placeholder="请输入材料名" autocomplete="off" class="layui-input"/>
	    </div>
	  </div>
	  <div class="layui-form-item layui-form-text">
	    <label class="layui-form-label">材料描述：</label>
	    <div class="layui-input-block">
	      <textarea name="stuffdescriptioninsert" placeholder="请输入材料描述" class="layui-textarea"></textarea>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">材料价格：</label>
	    <div class="layui-input-block">
	      <input type="text" name="stuffpayinsert" lay-verify="required" placeholder="请输入材料价格" autocomplete="off" class="layui-input"/>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <div class="layui-input-block">
	      <input class="buttonSubmit" type="submit" value="保存" />
	    </div>
	  </div>
	</form>
	</c:otherwise>
</c:choose>
<%-- <div>${sessionScope.CompanyUserid}zzzzzzzzzzzz</div>
<div>${sessionScope.CompanyID}zzzzzzzzzzzz</div> --%>
</body>
</html>