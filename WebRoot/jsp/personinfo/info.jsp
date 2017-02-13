<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'mergevote.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<meta http-equiv="Content-Type" content="text/html; charset=gb2312">

<style type="text/css">
<!--
body {
	background-color: #99CCFF;
}

.STYLE1 {
	color: #FF00FF
}
-->
</style>

</head>

<body>
	<div>
		<h2 align="center" class="STYLE1">personal information</h2>
		<form action="savemerge.action" method="post">
			<div align="center">
				<table width="344">
					<tr>
						<td width="20%">name</td>
						<td width="80%"><s:property value="#session.user.name" /></td>
					</tr>
					<tr>
						<td width="20%">school</td>
						<td width="80%"><s:property value="#session.user.school" /></td>
					</tr>
					<tr>
						<td width="20%">major</td>
						<td width="80%"><s:property value="#session.user.school" /></td>
					</tr>
					<tr>
						<td width="20%">school</td>
						<td width="80%"><s:property value="#session.user.major" /></td>
					</tr>
					<tr>
						<td width="20%">grade</td>
						<td width="80%"><s:property value="#session.user.grade" /></td>
					</tr>
					<tr>
						<td width="20%">classno</td>
						<td width="80%"><s:property value="#session.user.classno" /></td>
					</tr>
					<tr>
						<td width="20%">identity</td>
						<td width="80%"><s:property value="#session.user.identity" /></td>
					</tr>
				</table>
			</div>
		</form>
	</div>
</body>
</html>