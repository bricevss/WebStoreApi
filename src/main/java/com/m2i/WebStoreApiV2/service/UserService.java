package com.m2i.WebStoreApiV2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.WebStoreApiV2.entity.Users;
import com.m2i.WebStoreApiV2.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	
	public void create(Users u) {
		repo.save(u);
	}

	public Users getById(int id) {
		return repo.findById(id).orElse(null);
	}

	public List<Users> getAll() {
		return repo.findAll();
	}

	public void update(int id, Users u) {
		Users user = repo.findById(id).orElse(null);
		if (u!= null) {
			user.setLogin( u.getLogin() );
			user.setPassword( u.getPassword());
			user.setConnectionNumber( u.getConnectionNumber());
			user.setUserInformations( u.getUserInformations() );
			user.setRoles( u.getRoles() );
			repo.save(user);
		}
	}

	public void delete(int id) {
		Users user = repo.findById(id).orElse(null);
		if (user!= null) {
			repo.delete(user);
		}
		
	}

}