package com.crm.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.crm.dao.RoleDao;
import com.crm.entity.Role;

@Repository("roleDao")
public class RoleDaoImpl extends BaseDao implements RoleDao{
	//ÐÂÔö½ÇÉ«
	@Override
	public boolean addRole(Role role) {
		getSession().save(role);
		return true;
	}

	@Override
	public Role getById(int id) {
		return getSession().get(Role.class,id);
	}

	@Override
	public boolean updateRole(Role role) {
		getSession().update(role);
		return true;
	}

	@Override
	public List findRoleList(String hql) {
		return getSession().createQuery(hql).list();
	}
	
	
}
