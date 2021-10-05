package com.example.demo.loginservice;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import com.example.demo.repo.CollegeRepository;

@Service
public class LoginService {
	
	private CollegeRepository repo;
	
	public User login(String userName, String password) {
		User user = repo.findByUserNameAndPassword(userName, password);
		return user;
	}

}
