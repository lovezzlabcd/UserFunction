package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.crm.dao.UserDao;
import com.crm.entity.Tb_User;
import com.crm.service.UserService;

@Service("userService")
@Transactional(propagation=Propagation.REQUIRED)
public class UserServiceImpl implements UserService{
	
	//需要依赖的服务层
	@Resource(name="UserDao")
	private UserDao userdao;
	@Override
	public boolean addUser(Tb_User user) {
		return userdao.addUser(user);
	}

	@Override
	public List findUserList() {
		return userdao.findUserList("from Tb_User");
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
}
