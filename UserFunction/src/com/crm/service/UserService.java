package com.crm.service;

import java.util.List;

import com.crm.entity.Tb_User;

public interface UserService {
	//�����û�
	public boolean addUser(Tb_User user);
	
	//��ѯ�û�
	public List findUserList();
}
