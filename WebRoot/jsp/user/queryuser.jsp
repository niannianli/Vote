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
		<h2 align="center" class="STYLE1">user list</h2>
		<form action="savemerge.action" method="post">
			<div align="center">
				<table border="1">
					<tr>
						<th>userid</th>
						<th>name</th>
						<th>pwd</th>
						<th>school</th>
						<th>major</th>
						<th>grade</th>
						<th>classno</th>
						<th>identity</th>
					</tr>
					<s:iterator value="list">
						<tr>
							<td><s:property value="userid" /></td>
							<td><s:property value="name" /></td>
							<td><s:property value="pwd" /></td>
							<td><s:property value="school" /></td>
							<td><s:property value="major" /></td>
							<td><s:property value="grade" /></td>
							<td><s:property value="classno" /></td>
							<td><s:property value="identity" /></td>
						</tr>
					</s:iterator>
				</table>
			</div>
		</form>
	</div>
</body>
</html>