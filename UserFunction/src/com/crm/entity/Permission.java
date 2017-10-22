package com.crm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="crm_permission")
public class Permission {
		private int pid;
		private String pname;
		private int ptype;
		
		public Permission() {
			super();
		}

		public Permission(int pid, String pname, int ptype) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.ptype = ptype;
		}
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public int getPtype() {
			return ptype;
		}

		public void setPtype(int ptype) {
			this.ptype = ptype;
		}
}
