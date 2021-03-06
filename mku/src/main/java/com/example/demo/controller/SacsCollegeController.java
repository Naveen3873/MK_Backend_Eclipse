package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SacsCollegeFaculty;
import com.example.demo.repo.SacsCollegeRepository;

@RestController
@RequestMapping(value="/sacscollege")
public class SacsCollegeController {
	
	@Autowired
	public SacsCollegeRepository sacsCollegeRepo;
	
	@PostMapping(value = "/insert")
	public ResponseEntity<?> insertFaculty(@RequestBody final SacsCollegeFaculty f){
		System.out.println(f.getName());
		sacsCollegeRepo.save(f);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("Faculty insert successfully");
	}
}
