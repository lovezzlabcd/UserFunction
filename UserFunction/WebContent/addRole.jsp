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
		<h2>新增角色</h2>
		<s:if test="msg==1">
				<p style="color:red">添加角色成功</p>
		</s:if>
		<s:elseif test="msg==0">
				<p style="color:green">添加角色失败</p>
		</s:elseif>
		<s:form action="roleAction_addRole" method="post">
					角色名:<s:textfield name="role.rname"/><br/>
					状态:<s:radio list="#{0:'不可用',1:'正常' }" name="role.rtype" value="%{1}"/><br/>
					加入权限:<s:select list="#request.perList" name="permission.permisson_no" headerKey="" headerValue="请选择权限" listKey="pid" listValue="pname"/><br/>
					<s:submit value="新增角色"/>
		</s:form>
</body>
</html>