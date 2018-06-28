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
<div class="layui-col-lg-offset4">
    <h3>(特殊说明：员工类型中,0对应总监，1对应项目经理，2对应设计师，3对应水电工，4对应泥工，5对应木工，6对应漆工)</h3>
</div>
<c:choose>
<c:when test="${updateuser!=null}">
<form class="layui-form" action="${pageContext.request.contextPath}/companyuser/updateComplete/${updateuser.ID}"
				method="post" style="margin-top: 30px">
	<%--   <div class="layui-form-item">
	    <label class="layui-form-label">员工ID：</label>
	    <div class="layui-input-block">
	      <input type="text" name="companyID" required  lay-verify="required" placeholder="请输入公司ID" autocomplete="off" class="layui-input" value="${updatework.companyID}">
	    </div>
	  </div> --%>
	   <div class="layui-form-item">
	    <label class="layui-form-label">公司ID：</label>
	    <div class="layui-input-block">
	      <input type="text" name="companyid"  lay-verify="required" placeholder="请输入公司ID" autocomplete="off" class="layui-input" value="${updateuser.companyID}" readonly/>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">员工类型:</label>
	    <div class="layui-input-block">
	      <input type="text" name="companyusertype" lay-verify="required" placeholder="请输入员工类型" autocomplete="off" class="layui-input" value="${updateuser.type}"/>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">员工名:</label>
	    <div class="layui-input-block">
	      <input type="text" name="companyusername" lay-verify="required" placeholder="请输入员工名" autocomplete="off" class="layui-input" value="${updateuser.username}"/>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">员工密码:</label>
	    <div class="layui-input-block">
	      <input type="text" name="companyuserpassword" lay-verify="required" placeholder="请输入员工密码" autocomplete="off" class="layui-input" value="${updateuser.password}"/>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">员工电话:</label>
	    <div class="layui-input-block">
	      <input type="text" name="companyusertel" lay-verify="required" placeholder="请输入员工电话" autocomplete="off" class="layui-input" value="${updateuser.tel}"/>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">员工收入:</label>
	    <div class="layui-input-block">
	      <input type="text" name="companyuserincome" lay-verify="required" placeholder="请输入员工收入" autocomplete="off" class="layui-input" value="${updateuser.income}"/>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <div class="layui-input-block">
	      <input class="buttonSubmit" type="submit" value="保存修改" />
	    </div>
	  </div>
	</form>
</c:when>
<c:otherwise>
	<form class="layui-form" action="${pageContext.request.contextPath}/companyuser/insertcomplete"
				method="post" style="margin-top: 30px">
	  <div class="layui-form-item">
	    <label class="layui-form-label">公司ID：</label>
	    <div class="layui-input-block">
	      <input type="text" name="companyidinsert"  lay-verify="required" placeholder="请输入公司ID" autocomplete="off" class="layui-input" value="${sessionScope.CompanyID}" readonly/>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">员工类型:</label>
	    <div class="layui-input-block">
	      <input type="text" name="companyusertypeinsert" lay-verify="required" placeholder="请输入员工类型" autocomplete="off" class="layui-input"/>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">员工名:</label>
	    <div class="layui-input-block">
	      <input type="text" name="companyusernameinsert" lay-verify="required" placeholder="请输入员工名" autocomplete="off" class="layui-input"/>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">员工密码:</label>
	    <div class="layui-input-block">
	      <input type="text" name="companyuserpasswordinsert" lay-verify="required" placeholder="请输入员工密码" autocomplete="off" class="layui-input"/>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">员工电话:</label>
	    <div class="layui-input-block">
	      <input type="text" name="companyusertelinsert" lay-verify="required" placeholder="请输入员工电话" autocomplete="off" class="layui-input"/>
	    </div>
	  </div>
	  <div class="layui-form-item">
	    <label class="layui-form-label">员工收入:</label>
	    <div class="layui-input-block">
	      <input type="text" name="companyuserincomeinsert" lay-verify="required" placeholder="请输入员工收入" autocomplete="off" class="layui-input"/>
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