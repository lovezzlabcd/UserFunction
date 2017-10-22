<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h2>角色列表</h2>
			<s:if test="msg==2">
				<p style="color:red">修改角色成功</p>
		</s:if>
		<s:elseif test="msg==3">
				<p style="color:green">修改角色失败</p>
		</s:elseif>
		<table border="1" width="600">
		<tr>
		<td>编号</td><td>角色名</td><td>状态</td><td>管理</td>
		</tr>
		<s:iterator var="role" value="#request.roleList" status="ids">
		<tr>
		<td>${ids.count }</td><td>${role.rname }</td><td>${role.rtype==1?"正常":"销毁" }</td>
		<td>
				<a href="roleAction_toUpdateRole?role.rid=${role.rid }">修改</a>
		</td>
		</tr>
		</s:iterator>
		</table>
</body>
</html>