package com.crm.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * 用户和角色
 */
@Entity
@Table(name="user_role")
public class user_role {
		private int ur_id;
		
		private Tb_User user;
		private Role role;
		
		public user_role() {
			super();
		}

		public user_role(int ur_id) {
			super();
			this.ur_id = ur_id;
		}
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		public int getUr_id() {
			return ur_id;
		}

		public void setUr_id(int ur_id) {
			this.ur_id = ur_id;
		}
		@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
		@JoinColumn(name="user_no")
		public Tb_User getUser() {
			return user;
		}

		public void setUser(Tb_User user) {
			this.user = user;
		}
		
		@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
		@JoinColumn(name="role_no")
		public Role getRole() {
			return role;
		}

		public void setRole(Role role) {
			this.role = role;
		}
}
