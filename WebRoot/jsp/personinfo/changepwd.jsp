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
		<h2 align="center" class="STYLE1">change password</h2>
		<form action="mergepwd.action" method="post">
			<div align="center">
				<table align="center">
					<tr>
						<td width="40%">name</td>
						<td width="60%"><s:property value="#session.user.name" /></td>
					</tr>
					<tr>
						<td width="40%">old password</td>
						<td width="60%"><s:property value="#session.user.pwd" /></td>
					</tr>
					<tr>
						<td width="40%">new password</td>
						<td width="60%"><input type="password" name="u.pwd" /></td>
					</tr>
					<tr>
						<td colspan="2"><p>
								<input type="submit" value="submit" />
							</p>
							<p>&nbsp;</p></td>
					</tr>
				</table>
			</div>
		</form>
	</div>
</body>
</html>