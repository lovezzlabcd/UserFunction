package com.crm.dao;

import java.util.List;

import com.crm.entity.Permission;

/*
 * Ȩ�޵����ݿ������
 */
public interface PermissionDao {
		//����Ȩ��
	public boolean addPermission(Permission msion);
	
	//��ѯȨ��
	public List PermissionList(String hql);
}
