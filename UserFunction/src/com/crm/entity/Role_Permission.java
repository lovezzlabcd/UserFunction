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
 * х╗оч_╫ги╚
 */
@Entity
@Table(name="permission_role")
public class Role_Permission {
		private int rp_id;
		
		private Role role;
		private Permission permission;
		
		public Role_Permission() {
			super();
		}

		public Role_Permission(int rp_id) {
			super();
			this.rp_id = rp_id;
		}
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		public int getRp_id() {
			return rp_id;
		}

		public void setRp_id(int rp_id) {
			this.rp_id = rp_id;
		}
		@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
		@JoinColumn(name="role_no")
		public Role getRole() {
			return role;
		}

		public void setRole(Role role) {
			this.role = role;
		}
		@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
		@JoinColumn(name="permisson_no")
		public Permission getPermission() {
			return permission;
		}

		public void setPermission(Permission permission) {
			this.permission = permission;
		}
}
