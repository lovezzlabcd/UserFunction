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
		
		//��Ҫ�����ķ����
		@Resource(name="userService")
		private UserService userServie;
		
		@Resource(name="roleService")
		private RoleService roleService;
		
		//ȥ�������û���ҳ��
		public String toAddUser(){
			//ȥ�������û���ҳ��ʱ�ѽ�ɫ��ѯ����
			ActionContext.getContext().put("roleList",roleService.findRoleList());
			return "addUser";
		}
		
		//����û�
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