package com.crm.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.crm.dao.PermissionDao;
import com.crm.entity.Permission;

@Repository("permissionDao")
public class PermissionDaoImpl extends BaseDao implements PermissionDao{

	@Override
	public boolean addPermission(Permission msion) {
		getSession().save(msion);
		return true;
	}

	@Override
	public List PermissionList(String hql) {
		return getSession().createQuery(hql).list();
	}
		
}
