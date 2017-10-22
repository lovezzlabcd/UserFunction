package com.crm.service;

import java.util.List;

import com.crm.entity.Permission;

/**
 * 提供权限相关服务的接口
 * @author Administrator
 *
 */
public interface PermissionService {
		//新增权限
	public boolean addPermission(Permission msion);
	
	//查询所有权限
	public List PermissionList();
}
