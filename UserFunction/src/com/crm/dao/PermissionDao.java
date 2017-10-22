package com.crm.dao;

import java.util.List;

import com.crm.entity.Permission;

/*
 * 权限的数据库操作类
 */
public interface PermissionDao {
		//新增权限
	public boolean addPermission(Permission msion);
	
	//查询权限
	public List PermissionList(String hql);
}
