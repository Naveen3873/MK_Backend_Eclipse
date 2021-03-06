package com.example.demo.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.College;


public interface CollegeRepository extends CrudRepository<College, Integer>{

	@Query("SELECT cl FROM College cl WHERE cl.userName = ?1 and cl.password = ?2")
	public College findByUsernameAndPassword(String userName, String password);

}
