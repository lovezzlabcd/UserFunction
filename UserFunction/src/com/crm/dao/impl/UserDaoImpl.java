package com.crm.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.crm.dao.UserDao;
import com.crm.entity.Tb_User;
@Repository("UserDao")
public class UserDaoImpl extends BaseDao implements UserDao{
	
	@Override
	public boolean addUser(Tb_User user) {
		getSession().save(user);
		return true;
	}

	@Override
	public List findUserList(String hql) {
		return getSession().createQuery(hql).list();
	}
		
}
