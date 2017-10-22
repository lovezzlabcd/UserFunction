<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h2>权限列表</h2>
		<table border="1" width="600">
		<tr>
		<td>编号</td><td>权限名称</td><td>状态</td>
		</tr>
		<s:iterator var="obj" value="#request.perList" status="ids">
		<tr>
		<td>${ids.count }</td><td>${obj.pname }</td><td>${obj.ptype==1?"正常":"销毁" }</td>
		</tr>
		</s:iterator>
		</table>
</body>
</html>