package com.crm.service;

import java.util.List;

import com.crm.entity.Tb_User;

public interface UserService {
	//新增用户
	public boolean addUser(Tb_User user);
	
	//查询用户
	public List findUserList();
}
