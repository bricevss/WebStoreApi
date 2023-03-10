package com.m2i.WebStoreApiV2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m2i.WebStoreApiV2.entity.Command;
import com.m2i.WebStoreApiV2.entity.Users;
import com.m2i.WebStoreApiV2.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService uService;
	
	@GetMapping("/{id}")
	public Users getUserById(@PathVariable("id") int id) {
		
//		Users u = uService.getById(id);
//		
//		List<Command> maList = u.getCommand();
//		int somme = 0;
//		
//		for(Command c:maList) {
//			
//			somme = (int) (somme + c.getPayment().getAmount());
//			
//		}
		
		return uService.getById(id);
	}
	
	@GetMapping("/{id}")
	public Users getMontantTotalByUser(@PathVariable("id") int id) {
		
		Users u = uService.getById(id);
		
		List<Command> maList = u.getCommand();
		int somme = 0;
		
		for(Command c:maList) {
			
			somme = (int) (somme + c.getPayment().getAmount());
			
		}
		
		return uService.getById(somme);
	}
	
	@GetMapping
	public List<Users> getAll(){
		return uService.getAll();
	}
	
	@PostMapping
	public void postUser(@RequestBody Users u) {
		uService.create(u);
	}
	
	@PutMapping("/{id}")
	public void putUser(@PathVariable("id") int id,@RequestBody Users u) {
		uService.update(id, u);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		uService.delete(id);
	}
}
