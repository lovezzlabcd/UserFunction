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
			<h2>添加用户</h2>
			<s:if test="msg==1">
					<p style="color:red">添加用户成功</p>
			</s:if>
			<s:elseif test="msg==0">
					<p style="color:green">添加用户失败</p>
			</s:elseif>
			<s:form action="userAction_addUser" method="post">
						用户名:<s:textfield name="user.uname"/><br/>
						密码:<s:textfield name="user.upwd"/><br/>
						真实姓名:<s:textfield name="user.realname"/><br/>
						证件号码:<s:textfield name="user.idnumber"/><br/>
						用户类型:<s:radio list="#{0:'销户',1:'正常' }" name="user.usertype" value="%{1}"/><br/>
						加入角色:<s:select list="#request.roleList" name="role.role_no" headerKey="" headerValue="请选择角色" listKey="rid" listValue="rname"/><br/>
						<s:submit value="新增用户"/>
			</s:form>
</body>
</html>