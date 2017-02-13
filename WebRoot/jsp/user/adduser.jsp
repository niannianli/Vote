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
		<h2 align="center" class="STYLE1">add user</h2>
		<form action="adduser.action" method="post">
			<div align="center">
				<table>
					<tr>
						<td>name</td>
						<td><input type="text" name="u.name" /></td>
					</tr>
					<tr>
						<td>pwd</td>
						<td><input type="text" name="u.pwd" /></td>
					</tr>
					<tr>
						<td>school</td>
						<td><input type="text" name="u.school" /></td>
					</tr>
					<tr>
						<td>major</td>
						<td><input type="text" name="u.major" /></td>
					</tr>
					<tr>
						<td>grade</td>
						<td><input type="text" name="u.grade" /></td>
					</tr>
					<tr>
						<td>classno</td>
						<td><input type="text" name="u.classno" /></td>
					</tr>
					<tr>
						<td>identity</td>
						<td><select name="u.identity">
								<option value="student">student</option>
								<option value="faculty">faculty</option>
								<option value="administrator">administrator</option>
						</select></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="submit" /></td>
					</tr>
				</table>
			</div>
		</form>
	</div>
</body>
</html>