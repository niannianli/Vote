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
		<h2 align="center" class="STYLE1">edit vote</h2>
		<form action="savemerge.action" method="post">
			<div align="center">
				<input type="hidden" name="vote.voteid"
					value="<s:property value='#v.voteid'/>" />
				<table border="1">
					<tr>
						<td>userid</td>
						<td><input type="text" name="vote.userid"
							value="<s:property value='#v.userid'/>" /></td>
					</tr>
					<tr>
						<td>title</td>
						<td><input type="text" name="vote.title"
							value="<s:property value='#v.title'/>" /></td>
					</tr>
					<tr>
						<td>question</td>
						<td><input type="text" name="vote.question"
							value="<s:property value='#v.question'/>" /></td>
					</tr>
					<tr>
						<td>classification</td>
						<td><input type="text" name="vote.classification"
							value="<s:property value='#v.classification'/>" /></td>
					</tr>
					<tr>
						<td>publishdate</td>
						<td><input type="text" name="vote.publishdate"
							value="<s:property value='#v.publishdate'/>" /></td>
					</tr>
					<tr>
						<td>finishdate</td>
						<td><input type="text" name="vote.finishdate"
							value="<s:property value='#v.finishdate'/>" /></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="edit vote" /></td>
					</tr>
				</table>
			</div>
		</form>
	</div>
</body>
</html>
