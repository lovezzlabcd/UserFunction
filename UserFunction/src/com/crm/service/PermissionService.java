package com.crm.service;

import java.util.List;

import com.crm.entity.Permission;

/**
 * �ṩȨ����ط���Ľӿ�
 * @author Administrator
 *
 */
public interface PermissionService {
		//����Ȩ��
	public boolean addPermission(Permission msion);
	
	//��ѯ����Ȩ��
	public List PermissionList();
}
