package com.crm.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.crm.entity.Permission;
import com.crm.service.PermissionService;
import com.opensymphony.xwork2.ActionContext;

@Controller("permissionAction")
@Scope("prototype")
public class PermissionAction {
		
		//定义一个属性封装请求数据
		private Permission msion;
		private int msg;
		
		//声明需要依赖的服务层
		@Resource(name="permissionService")
		private PermissionService permisse;
		//去到新增权限页面
		public String toAddPersion(){
			return "addPersion";
		}
		//新增权限
		public String addPersion(){
			if(permisse.addPermission(msion)){
				msg=1;
			}else{
				msg=0;
			}
				return "toAddPersion";
		}
		
		//查询权限
		public String findPersion(){
			ActionContext.getContext().put("perList", permisse.PermissionList());
			return "perList";
		}

		public Permission getMsion() {
			return msion;
		}

		public void setMsion(Permission msion) {
			this.msion = msion;
		}

		public int getMsg() {
			return msg;
		}

		public void setMsg(int msg) {
			this.msg = msg;
		}

		public PermissionService getPermisse() {
			return permisse;
		}

		public void setPermisse(PermissionService permisse) {
			this.permisse = permisse;
		}
		
		
}
