package com.m2i.WebStoreApiV2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.WebStoreApiV2.entity.UserInformations;
import com.m2i.WebStoreApiV2.repository.UserInformationsRepository;

@Service
public class UserInformationsService {

	@Autowired
	UserInformationsRepository repo;
	
	public void create(UserInformations u) {
		repo.save(u);
	}
	
	public UserInformations getById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<UserInformations> getAll() {
		return repo.findAll();
	}
	
	public void update(int id, UserInformations u) {
		UserInformations userInformations = repo.findById(id).orElse(null);
		if (u!= null) {
			userInformations.setAddress( u.getAddress() );
			userInformations.setCity( u.getCity());
			userInformations.setEmail( u.getEmail());
			userInformations.setPhoneNumber( u.getPhoneNumber() );
			userInformations.setUser( u.getUser() );
			repo.save(userInformations);
		}
	}
	
	public void delete(int id) {
		UserInformations userInformations = repo.findById(id).orElse(null);
		if (userInformations!= null) {
			repo.delete(userInformations);
		}
		
	}

}