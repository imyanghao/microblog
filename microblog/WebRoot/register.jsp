<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title> 注册页面 </title>
    
    <link href="webstyle.css" rel="stylesheet">
    
  </head>
  
<body>

	<form action="${pageContext.request.contextPath }/servlet/RegisterAction" method="post">

		<div class="loginpage">
			<div class="UserName" >用户名：<input type="text" name="username" id="username"></div>
    		<div class="password" >密&nbsp;码：<input type="password" name="password" id="password"></div>
    		<div class="niceName" >昵&nbsp;称：<input type="text" name="nicename" id="nicename"></div>
		    <input type="submit" value="注册" class="regist"/>
	    </div>
    
    </form> 
    
</body>
</html>