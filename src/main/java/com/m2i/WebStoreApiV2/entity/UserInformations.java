package com.m2i.WebStoreApiV2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity @Table
@Getter @Setter
public class UserInformations {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String address;
	
	private String city;
	
	private String email;
	
	private String phoneNumber;
	
	@OneToOne @JoinColumn(name="id_user")
	private Users user;

}
