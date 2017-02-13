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

<title>login page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<style type="text/css">
body {
	background-image: url(image/background.jpg);
	background-color: #99CCFF;
}

h1 {
	font-size: 40px;
	color: fuchsia;
	text-align: center;
	padding: 100px 0 0 0;
}

table {
	padding: 10px 0 0 0;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=gb2312">

</head>

<body>
	<s:form action="login.action" namespace="/" method="post">
		<h1>3C Voting System</h1>
		<table align="center">
			<tr>
				<td>username:<input type="text" name="u.name" />
				</td>
			</tr>
			<tr>
				<td>password:<input type="password" name="u.pwd" />
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /> <input
					type="button" value="forget password"
					onClick="location.href='user/findpwd.jsp'" /></td>
			</tr>
		</table>
	</s:form>
</body>

</html>