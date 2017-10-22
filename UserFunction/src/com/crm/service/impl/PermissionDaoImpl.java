package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.crm.dao.PermissionDao;
import com.crm.entity.Permission;
import com.crm.service.PermissionService;

@Service("permissionService")
@Transactional(propagation=Propagation.REQUIRED)
public class PermissionDaoImpl implements PermissionService{
	
	
	@Resource(name="permissionDao")
	private PermissionDao perdao;
	
	@Override
	public boolean addPermission(Permission msion) {
		return perdao.addPermission(msion);
	}

	@Override
	public List PermissionList() {
		return perdao.PermissionList("from Permission");
	}

	public void setPerdao(PermissionDao perdao) {
		this.perdao = perdao;
	}
	
		
}
