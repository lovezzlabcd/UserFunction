package com.crm.service;

import java.util.List;

import com.crm.entity.Role;

/**
 * 角色服务层的接口
 * @author Administrator
 *
 */
public interface RoleService {
	//新增角色
	public boolean addRole(Role role);
	
	//查询角色
	public List findRoleList();
	
	//根据ID查询角色
	public Role getById(int id);
		
	//修改角色
	public boolean updateRole(Role role);
}
