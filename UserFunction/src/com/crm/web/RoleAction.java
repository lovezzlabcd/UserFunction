package com.crm.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.crm.entity.Role;
import com.crm.service.PermissionService;
import com.crm.service.RoleService;
import com.opensymphony.xwork2.ActionContext;

/**
 * �����ɫ����ز�����Action
 * @author Administrator
 *
 */
@Controller("roleAction")
@Scope("prototype")
public class RoleAction {
		private Role role;
		private int msg;
		
		//��Ҫ�����ķ����
		@Resource(name="roleService")
		private RoleService roleservice;
		
		@Resource(name="permissionService")
		private PermissionService misonservice;
		
		//ȥ��������ɫ��ҳ��
		public String toAddRole(){
			//ȥ��������ɫǰ��Ȩ�޲�ѯ����
			ActionContext.getContext().put("perList",misonservice.PermissionList());
			return "addRole";
		}
		
		//��ӽ�ɫ
		public String addRole(){
			if(roleservice.addRole(role)){
				msg=1;
			}else{
				msg=0;
			}
				return "toAddRole";
		}
		//��ѯ��ɫ
		public String findRoleList(){
			ActionContext.getContext().put("roleList",roleservice.findRoleList());
			return "roleList";
		}
		
		//ȥ���޸Ľ�ɫҳ��
		public String toUpdateRole(){
			//ȥ��������ɫǰ��Ȩ�޲�ѯ����
			ActionContext.getContext().put("perList",misonservice.PermissionList());
			role=roleservice.getById(role.getRid());
			return "UpdateRole";
		}
		
		//�޸�ҳ��
		public String updateRole(){
			if(roleservice.updateRole(role)){
				msg=2;
			}else{
				msg=3;
			}
				return "toUpdateRole";
		}
		public Role getRole() {
			return role;
		}

		public void setRole(Role role) {
			this.role = role;
		}

		public int getMsg() {
			return msg;
		}

		public void setMsg(int msg) {
			this.msg = msg;
		}

		public RoleService getRoleservice() {
			return roleservice;
		}

		public void setRoleservice(RoleService roleservice) {
			this.roleservice = roleservice;
		}

		public PermissionService getMisonservice() {
			return misonservice;
		}

		public void setMisonservice(PermissionService misonservice) {
			this.misonservice = misonservice;
		}
}
