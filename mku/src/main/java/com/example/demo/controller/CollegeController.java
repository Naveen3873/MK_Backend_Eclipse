package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.College;
import com.example.demo.model.ColllegeResponse;
import com.example.demo.repo.CollegeRepository;
import com.example.demo.repo.ResponseRepository;

@RestController
@RequestMapping(value="/college")
public class CollegeController {

	@Autowired
	public CollegeRepository collegeRepo;
	@Autowired
	ResponseRepository responseRepo;
	
	@PostMapping(value = "/insert")
	public ResponseEntity<?> insertCollege(@RequestBody final College c){
		collegeRepo.save(c);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("college insert successfully");
	}

	@GetMapping(value = "/getAll")
	public ResponseEntity<?> getAllColleges(){
		ArrayList<College> colleges= (ArrayList<College>) collegeRepo.findAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(colleges);
	}

	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteCollege(@PathVariable final int id){
		collegeRepo.deleteById(id);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("College deleted Successfully!");
		
	}

	@GetMapping(value = "/get/{id}")
	public ResponseEntity<?> getCollege(@PathVariable final int id){
		College college = collegeRepo.findById(id).get();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(college);
	}
	@PostMapping(value="/update")
	public ResponseEntity<?> updateCollege(@RequestBody final College c){
		collegeRepo.save(c);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("College update successfully!");
	}	
	

	@PostMapping(value = "/user")	
	public ResponseEntity<?> findByUsernameAndPassword(@RequestBody final College cl){
		College college = (College) collegeRepo.findByUsernameAndPassword(cl.getUserName(), cl.getPassword());
		int collegeId;
		
		if(college!=null) {
			collegeId = college.getId();
			return ResponseEntity
					.status(HttpStatus.OK)
					.body(collegeId);
		}
		else {
			return ResponseEntity
					.status(HttpStatus.BAD_REQUEST)
					.body("login failed");
		}
	}
	
	@PostMapping(value = "/response")
	public ResponseEntity<?> sendResponse(@RequestBody final ColllegeResponse sr){
		responseRepo.save(sr);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body("response send successfully");
	}
	
}
