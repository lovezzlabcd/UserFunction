package com.crm.dao;

import java.util.List;

import com.crm.entity.Tb_User;

public interface UserDao {
	//�����û�
	public boolean addUser(Tb_User user);
	
	//��ѯ�û�
	public List findUserList(String hql);
}
