package com.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="crm_role")
public class Role {
		private int rid;
		private String rname;	//Ãû³Æ
		private int rtype;	//×´Ì¬
		
		public Role() {
			super();
		}

		public Role(int rid, String rname, int rtype) {
			super();
			this.rid = rid;
			this.rname = rname;
			this.rtype = rtype;
		}
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		public int getRid() {
			return rid;
		}

		public void setRid(int rid) {
			this.rid = rid;
		}

		public String getRname() {
			return rname;
		}

		public void setRname(String rname) {
			this.rname = rname;
		}

		public int getRtype() {
			return rtype;
		}

		public void setRtype(int rtype) {
			this.rtype = rtype;
		}
		
		
}
