<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录页面</title>
    
	<link href="webstyle.css" rel="stylesheet">
  </head>
  
<body>

	<form action="${pageContext.request.contextPath }/servlet/LoginAction?method=login" method="post">
	
		<div class="loginpage">
			<div class="UserName" >用户名：<input type="text" id="username" name="username"></div>
		    <div class="password" >密&nbsp;码：<input type="password" id="password" name="password"></div>
		     
		    <input type="submit" value="登录" class="login"/>
		     
		    <button class="goregist" onclick="{window.location.href='register.jsp'}">去注册</button>
    	</div>
    
    </form>
    
</body>
</html>
