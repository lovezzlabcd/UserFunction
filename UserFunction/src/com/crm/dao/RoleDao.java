package com.crm.dao;

import java.util.List;

import com.crm.entity.Role;

public interface RoleDao {
	//新增角色
	public boolean addRole(Role role);
	
	//查询角色
	public List findRoleList(String hql);
	
	//根据ID查询角色
	public Role getById(int id);
	
	//修改角色
	public boolean updateRole(Role role);
}
