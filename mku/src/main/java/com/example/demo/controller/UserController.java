//package com.example.demo.controller;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.model.College;
//import com.example.demo.model.User;
//import com.example.demo.repo.CollegeRepository;
//
//import antlr.collections.List;
//
//@RestController
//@RequestMapping(value = "/user")
//public class UserController {
//	
//	@Autowired
//	public CollegeRepository clgrepo;
//	
//	@GetMapping(value = "/get/{id}")
//	@PostMapping
//	public ResponseEntity<User> getUser(@PathVariable final int id){
//		if(user)
//		return clgrepo.getUser();				
//	}
//	
//}
