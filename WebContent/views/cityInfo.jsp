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

</tr>


<tr>
<td>${cityInfo.Name}</td>
<td>${cityInfo.District}</td>
<td>${cityInfo.Population}</td>
<td>${cityInfo.CountryCode}</td>
<td>${cityInfo.ID}</td>

</tr>

</tbody>
</table>

</body>
</html>