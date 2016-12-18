<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	
	<link href="webstyle.css" rel="stylesheet"/>
	
  </head>
  
  <body>
  
    <div class="main">
    	<div class="texta">
    		<form action="${pageContext.request.contextPath }/servlet/TopicAction" method="post">
	        	<textarea id="webtext" name="webtext" placeholder="说点什么吧..." name="webtext"></textarea> 
	           	<input type="submit" value="提交" class="send"/>
           	</form>
        </div>
         
        <c:if test="${!empty requestScope.meAndAllFriendTopic}">
        	<c:forEach var="t" items="${requestScope.meAndAllFriendTopic}">
        		<div class="webcontent">
        			<a href="##">
        				<c:if test="${sessionScope.loginUser.userName != t.users.userName }"> 
        					${t.users.niceName}:
        				</c:if>
        				<c:if test="${sessionScope.loginUser.userName == t.users.userName }"> 
        					自己:
        				</c:if>
        			
        		    </a> ${t.webtext}
        			<a class="yizan"> 
	        			<c:if test="${!empty t.list}">
	        				<c:forEach var="v" items="${t.list}">
	        					${v.niceName } 
	        				</c:forEach>
	        				已点赞
	        			</c:if>
        			
        			</a>
        			<a class="zan" href="${pageContext.request.contextPath }/servlet/DianpraiseAction?topicId=${t.topicId }">点赞(${t.praisecount })</a> 
        		<c:if test="${sessionScope.loginUser.userName == t.users.userName }"> 
        			<a href="${pageContext.request.contextPath }/servlet/DeleteAction?topicId=${t.topicId }" class="delete">删除</a>
        		</c:if>
        			
        			
        		</div>
        	</c:forEach> 
        </c:if>
         
    </div>
    
  </body>
</html>
