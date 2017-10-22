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
		
		//����һ�����Է�װ��������
		private Permission msion;
		private int msg;
		
		//������Ҫ�����ķ����
		@Resource(name="permissionService")
		private PermissionService permisse;
		//ȥ������Ȩ��ҳ��
		public String toAddPersion(){
			return "addPersion";
		}
		//����Ȩ��
		public String addPersion(){
			if(permisse.addPermission(msion)){
				msg=1;
			}else{
				msg=0;
			}
				return "toAddPersion";
		}
		
		//��ѯȨ��
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
