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

<title>get back password</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<style type="text/css">
div {
	padding: 150px 100px 300px 100px;
}

.STYLE1 {
	color: #FF00FF
}

body {
	background-color: #99CCFF;
}

a:link {
	color: #FFFFFF;
}

a:visited {
	color: #FFFFFF;
}

a:hover {
	color: #FF00FF;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
</head>

<body>
	<div>
		<h3 class="STYLE1">Forgot your password?</h3>
		<form action="getpwd.action" method="post">
			input your name:<input type="text" name="u.name" />
			<p />
			<input type="submit" value="get back password" />
		</form>
		<s:property value='us.name' />
		<span class="STYLE1">your password is : <s:property
				value='#us.pwd' />
		</span>
		<p />
		<a href="jsp/login.jsp">click here to go back to login page</a>
	</div>
</body>

</html>