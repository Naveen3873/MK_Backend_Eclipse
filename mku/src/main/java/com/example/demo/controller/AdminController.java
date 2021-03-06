package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Admin;
import com.example.demo.repo.AdminRepository;

@RestController
@RequestMapping(value="/admin")
public class AdminController {
	
	@Autowired
	public AdminRepository adminRepo;
	
	@PostMapping(value = "/user")	
	public ResponseEntity<?> findByUsernameAndPassword(@RequestBody final Admin ad){
		Admin admin = (Admin) adminRepo.findByUsernameAndPassword(ad.getUserName(), ad.getPassword());
		int id;
		
		if(admin!=null) {
			id = admin.getId();
			return ResponseEntity
					.status(HttpStatus.OK)
					.body(id);
		}
		else {
			return ResponseEntity
					.status(HttpStatus.BAD_REQUEST)
					.body("login failed");		
		}
	}	
}
