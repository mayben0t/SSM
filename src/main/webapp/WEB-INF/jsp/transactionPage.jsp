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
	<form class="layui-form" action="${pageContext.request.contextPath}/trans/updatecomplete"
				method="post" style="margin-top: 30px">
	  <div class="layui-form-item">
	    <label class="layui-form-label">事务ID：</label>
	    <div class="layui-input-block">
	      <input type="text" name="transID" required  lay-verify="required" autocomplete="off" class="layui-input" value="${transselect.ID}" readonly>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">用户ID：</label>
	    <div class="layui-input-block">
	      <input type="text" name="userid" required lay-verify="required"  autocomplete="off" class="layui-input" value="${transselect.userID}" readonly>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">公司ID：</label>
	    <div class="layui-input-block">
	      <input type="text" name="companyID" required lay-verify="required" autocomplete="off" class="layui-input" value="${transselect.companyID}" readonly>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">项目当前期限款(/元)：</label>
	    <div class="layui-input-block">
	      <input type="text" name="money" required lay-verify="required" placeholder="请输入当前期限款" autocomplete="off" class="layui-input" value="${transselect.money}">
	    </div>
	  </div>
	  <div class="layui-form-item layui-form-text">
	    <label class="layui-form-label">事务描述：</label>
	    <div class="layui-input-block">
	      <textarea name="description" placeholder="请输入当前事务进展等相关消息" class="layui-textarea">${transselect.description}</textarea>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">项目当前进展：</label>
	    <div class="layui-input-block">
	      <input type="text" name="progress" required lay-verify="required" placeholder="请输入当前进展" autocomplete="off" class="layui-input" value="${transselect.progress}" readonly>
	    </div>
	  </div>
	  
	  <div class="layui-form-item">
	    <label class="layui-form-label">用户打款进度：</label>
	    <div class="layui-input-block">
	      <input type="text" name="userconfirm" required lay-verify="required" placeholder="当前用户打款进度" autocomplete="off" class="layui-input" value="${transselect.userConfirm}" readonly>
	    </div>
	  </div>
	  <div class="layui-form-item layui-form-text">
	    <label class="layui-form-label">项目截止目前总款(/元)：</label>
	    <div class="layui-input-block">
	      <input type="text" name="total" required lay-verify="required" placeholder="项目截止目前总款(/元)" autocomplete="off" class="layui-input" value="${transselect.total}" readonly>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <div class="layui-input-block">
	      <input class="buttonSubmit" type="submit" value="保存修改" />
	    </div>
	  </div>
	</form>
</body>
</html>