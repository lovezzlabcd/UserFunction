package com.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * ”√ªß¿‡
 */
@Entity
@Table(name="fun_user")
public class Tb_User {
		private int uid;
		private String uname;
		private String upwd;
		private String realname;
		private int idnumber;
		private int usertype;
		
		public Tb_User() {
			super();
		}

		public Tb_User(int uid, String uname, String upwd, String realname,
				int idnumber, int usertype) {
			super();
			this.uid = uid;
			this.uname = uname;
			this.upwd = upwd;
			this.realname = realname;
			this.idnumber = idnumber;
			this.usertype = usertype;
		}
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		public int getUid() {
			return uid;
		}

		public void setUid(int uid) {
			this.uid = uid;
		}

		public String getUname() {
			return uname;
		}

		public void setUname(String uname) {
			this.uname = uname;
		}

		public String getUpwd() {
			return upwd;
		}

		public void setUpwd(String upwd) {
			this.upwd = upwd;
		}

		public String getRealname() {
			return realname;
		}

		public void setRealname(String realname) {
			this.realname = realname;
		}

		public int getIdnumber() {
			return idnumber;
		}

		public void setIdnumber(int idnumber) {
			this.idnumber = idnumber;
		}

		public int getUsertype() {
			return usertype;
		}

		public void setUsertype(int usertype) {
			this.usertype = usertype;
		}
}
