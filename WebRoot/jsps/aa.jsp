<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'aa.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
 
  <body>
  <%int aa=10; %>
   <!--   <%=aa%> -->
   <%--注释，不显示 --%>
    <table border="1" align="center" width="60%">
    	<tr>
    		<td>姓名</td>
    		<td>年龄</td>
    	</tr>
    	<%for(int a=1;a<10;a++){ %>
    	<tr>
    		<td>张三</td>
    		<td>29</td>
    	</tr>
    	<%} %>
    </table>
  </body>
</html>
