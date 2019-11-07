<%@	page import="entity.Account"%>
<%@	page import="java.util.List"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<%@ page import="java.util.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>列出账号</title>


  </head>
  
  <body>
    	<h3 align="center">账号信息</h3>
    	<hr color="blue">
    	<center>
    		<table border="1">
    			<tr>
    				<th>ID</th>
    				<th>姓名</th>
    				<th>金额</th>
    			</tr>
    			<c:forEach items="${acts}" var="act">
    				<tr>
    					<td>${act.id}</td>
    					<td>${act.name}</td>
    					<td>${act.balance}</td>
    					<td>
    						<a href="user/${act.id}">查看</a>
    						<a href="#" onclick="updateUesr(${act.id})">修改</a>
    						<a href="#" onclick="deleteUesr(${act.id})">删除</a>
    					</td>
    				</tr>
    			</c:forEach>
    		</table>
    	</center>
    	<script type="text/javascript" src="/"></script>
  </body>
</html>