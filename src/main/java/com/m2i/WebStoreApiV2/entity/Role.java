package com.m2i.WebStoreApiV2.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity @Table
@Getter @Setter
public class Role {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String RoleName;
	
	@ManyToMany
	@JoinTable(name = "user_role_association",
			joinColumns = @JoinColumn(name="id_role"),
			inverseJoinColumns = @JoinColumn(name="id_user"))
	private List<Users> users;	

	public Role() {
		super();
	}	

}
