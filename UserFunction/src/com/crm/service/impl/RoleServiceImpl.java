package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.crm.dao.RoleDao;
import com.crm.entity.Role;
import com.crm.service.RoleService;

@Service("roleService")
@Transactional(propagation=Propagation.REQUIRED)
public class RoleServiceImpl implements RoleService{
	
	//ÐèÒªÒÀÀµµÄdao²ã
	@Resource(name="roleDao")
	private RoleDao roledao;
	
	@Override
	public boolean addRole(Role role) {
		return roledao.addRole(role);
	}

	@Override
	public Role getById(int id) {
		return roledao.getById(id);
	}

	@Override
	public boolean updateRole(Role role) {
		return roledao.updateRole(role);
	}
	
	@Override
	public List findRoleList() {
		return roledao.findRoleList("from Role");
	}

	public void setRoledao(RoleDao roledao) {
		this.roledao = roledao;
	}
	
	
}
