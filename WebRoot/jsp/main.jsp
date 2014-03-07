<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>ึ๗าณ</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<style>
<!--
		

		#page{
			width:920px;
		}
		#top{
			height:100px;
			
		}
		#left{
	width:180px;
	height:650px;
	float:left;
	padding-top: 40px;
	padding-right: 0px;
	padding-bottom: 40px;
	padding-left: 0px;
		}
		#content{
			width:740px;
			height:400px;
			float:left;
		}
		
-->
    </style>
  </head>
  
  <body>

			<div id="page">
					<div id="top">
					  <%@include file="/jsp/top.jsp" %>
					</div>
					<div id="left">
					<%@include file="/jsp/menu.jsp"%>
					</div>
					<div id="content">
						<iframe src="jsp/welcome.jsp" name="view" width="100%" height="650" frameborder="0"></iframe>
					</div>					
			</div>&nbsp;

  </body>
</html>
