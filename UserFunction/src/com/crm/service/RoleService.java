package com.crm.service;

import java.util.List;

import com.crm.entity.Role;

/**
 * ��ɫ�����Ľӿ�
 * @author Administrator
 *
 */
public interface RoleService {
	//������ɫ
	public boolean addRole(Role role);
	
	//��ѯ��ɫ
	public List findRoleList();
	
	//����ID��ѯ��ɫ
	public Role getById(int id);
		
	//�޸Ľ�ɫ
	public boolean updateRole(Role role);
}
