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
		<h2>新增权限</h2>
		<s:if test="msg==1">
				<p style="color:red">添加权限成功</p>
		</s:if>
		<s:elseif test="msg==0">
				<p style="color:green">添加权限失败</p>
		</s:elseif>
		<s:form action="permissionAction_addPersion" method="post">
					权限名称:<s:textfield name="msion.pname"/><br/>
					状态:<s:radio list="#{0:'不可用',1:'正常' }" name="msion.ptype" value="%{1}"></s:radio><br/>
					<s:submit value="新增权限"/>
		</s:form>
</body>
</html>