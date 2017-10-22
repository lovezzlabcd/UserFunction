package com.crm.dao;

import java.util.List;

import com.crm.entity.Role;

public interface RoleDao {
	//������ɫ
	public boolean addRole(Role role);
	
	//��ѯ��ɫ
	public List findRoleList(String hql);
	
	//����ID��ѯ��ɫ
	public Role getById(int id);
	
	//�޸Ľ�ɫ
	public boolean updateRole(Role role);
}
