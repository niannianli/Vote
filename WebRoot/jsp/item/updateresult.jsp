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
    
    <title>My JSP 'updateresult.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	

  <meta http-equiv="Content-Type" content="text/html; charset=gb2312"><style type="text/css">
<!--
body {
	background-color: #99CCFF;
}
.STYLE1 {color: #FF00FF}
-->
  </style></head>
  
  <body>
  <div>
   	  <h2 align="center" class="STYLE1">update vote result </h2>
   	  <form action="mergeresult.action" method="post">
   	    <div align="center">
   	      <table border="1">
            <tr>
              <th>itemid</th>
              <th>voteid</th>
              <th>label</th>
              <th>content</th>
              <th>count</th>
            </tr>
            <s:iterator value="list">
              <tr>
                <td><input type="text" name="item.itemid" value="<s:property value='itemid'/>" readonly="readonly"/>
                </td>
                <td><s:property value="voteid"/>
                </td>
                <td><s:property value="label"/>
                </td>
                <td><s:property value="content"/>
                </td>
                <td><input type="text" name="item.count" value="<s:property value='count'/>"/>
                </td>
              </tr>
            </s:iterator>
            <tr>
              <td colspan="5" align="center"><input type="submit" value="update"/>
              </td>
            </tr>
          </table>
   	    </div>
   	  </form>
    </div>
  </body>
</html>
