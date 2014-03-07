<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

			
	<style type="text/css">
		
		h1{color:fuchsia; text-align:center;background-image:url("image/top.jpg");width:1200px; height:100px;}
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
				<h1>Hello   
			    <s:property value="#session.user.name"/>
			    !&nbsp;&nbsp;Welcome to  3C Voting System!</h1>
				<a href="loginout.action">logout</a>
			

	

