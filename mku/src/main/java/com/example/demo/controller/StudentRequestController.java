package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentRequest;
import com.example.demo.repo.StudentRequestRepository;

@RestController
@RequestMapping(value="/request")
public class StudentRequestController {
	
	@Autowired
	StudentRequestRepository requestRepo;
	
	@PostMapping(value="/insert")
	public ResponseEntity<?> insertRequest(@RequestBody final StudentRequest r){
		requestRepo.save(r);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Request sent successfully!");
		
	}	

}
