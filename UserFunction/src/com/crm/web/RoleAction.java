package com.crm.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.crm.entity.Role;
import com.crm.service.PermissionService;
import com.crm.service.RoleService;
import com.opensymphony.xwork2.ActionContext;

/**
 * 处理角色的相关操作的Action
 * @author Administrator
 *
 */
@Controller("roleAction")
@Scope("prototype")
public class RoleAction {
		private Role role;
		private int msg;
		
		//需要依赖的服务层
		@Resource(name="roleService")
		private RoleService roleservice;
		
		@Resource(name="permissionService")
		private PermissionService misonservice;
		
		//去到新增角色的页面
		public String toAddRole(){
			//去到新增角色前把权限查询出来
			ActionContext.getContext().put("perList",misonservice.PermissionList());
			return "addRole";
		}
		
		//添加角色
		public String addRole(){
			if(roleservice.addRole(role)){
				msg=1;
			}else{
				msg=0;
			}
				return "toAddRole";
		}
		//查询角色
		public String findRoleList(){
			ActionContext.getContext().put("roleList",roleservice.findRoleList());
			return "roleList";
		}
		
		//去到修改角色页面
		public String toUpdateRole(){
			//去到新增角色前把权限查询出来
			ActionContext.getContext().put("perList",misonservice.PermissionList());
			role=roleservice.getById(role.getRid());
			return "UpdateRole";
		}
		
		//修改页面
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
