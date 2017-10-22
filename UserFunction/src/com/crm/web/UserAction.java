package com.crm.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.crm.entity.Tb_User;
import com.crm.service.RoleService;
import com.crm.service.UserService;
import com.opensymphony.xwork2.ActionContext;

@Controller("userAction")
@Scope("prototype")
public class UserAction {
		private Tb_User user;
		private int msg;
		
		//需要依赖的服务层
		@Resource(name="userService")
		private UserService userServie;
		
		@Resource(name="roleService")
		private RoleService roleService;
		
		//去到新增用户的页面
		public String toAddUser(){
			//去到新增用户的页面时把角色查询出来
			ActionContext.getContext().put("roleList",roleService.findRoleList());
			return "addUser";
		}
		
		//添加用户
		public String addUser(){
			if(userServie.addUser(user)){
				msg=1;
			}else{
				msg=0;
			}
				return "toAddUser";
		}

		public Tb_User getUser() {
			return user;
		}

		public void setUser(Tb_User user) {
			this.user = user;
		}

		public int getMsg() {
			return msg;
		}

		public void setMsg(int msg) {
			this.msg = msg;
		}

		public UserService getUserServie() {
			return userServie;
		}

		public void setUserServie(UserService userServie) {
			this.userServie = userServie;
		}

		public RoleService getRoleService() {
			return roleService;
		}

		public void setRoleService(RoleService roleService) {
			this.roleService = roleService;
		}
}