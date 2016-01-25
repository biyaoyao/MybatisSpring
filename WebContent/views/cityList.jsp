<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%
String path=request.getContextPath(); 
		String basePath=request.getScheme()+ "://"+request.getServerName()+ ":"+request.getServerPort()+path+ "/"; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>home</title>
<style>

table{
border-collapse: collapse;
border-spacing: 0;
width:100%;
}
td{
border:1px solid #ddd;
text-align:center;
padding:5px 10px;
height:38px;
width:150px;
}
</style>
</head>
<body>
<h2>spring mvc + mybatis 实例</h2>

<table>


<tbody>
<tr>
<td>城市名称</td>
<td>所在区域</td>
<td>城市编码</td>
<td>国家代号</td>
<td>ID</td>
<td>操作</td>
</tr>

<c:forEach items="${cityList}" var="city">
<tr>
<td>${city.Name}</td>
<td>${city.District}</td>
<td>${city.Population}</td>
<td>${city.CountryCode}</td>
<td>${city.ID}</td>
<td><a href="<%=basePath %>page/cityInfo.action?id=${city.ID}">查看</a></td>
</tr>
</c:forEach>
</tbody>
</table>

</body>
</html>