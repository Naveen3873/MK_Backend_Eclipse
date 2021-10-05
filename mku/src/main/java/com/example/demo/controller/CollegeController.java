package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.College;
import com.example.demo.repo.CollegeRepository;

@RestController
@RequestMapping(value="/college")
public class CollegeController {

	@Autowired
	public CollegeRepository CollegeRepo;
	
	@PostMapping(value = "/insert")
	public ResponseEntity<?> insertCollege(@RequestBody final College c){
		CollegeRepo.save(c);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("college insert successfully");
		
	}

	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllColleges(){
		ArrayList<College> colleges= (ArrayList<College>) CollegeRepo.findAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(colleges);
	}
	
}
