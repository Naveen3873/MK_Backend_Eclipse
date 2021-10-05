package com.example.demo.repo;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.College;

public interface CollegeRepository extends CrudRepository<College, Integer>{

	User findByUserNameAndPassword(String userName, String password);

}
