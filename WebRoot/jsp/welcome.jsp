<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>个人信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		div{text-align: center;font-size: 50px;padding:100px 0 0 0;}
	body {
	background-color: #99CCFF;
}
.STYLE1 {color: #FF00FF}
    </style>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"></head>
<body>

	<div class="STYLE1">
	  <p>Welcome!</p>
	  <p>Create Consummate Campus! </p>
	</div>
</body>
</html>
