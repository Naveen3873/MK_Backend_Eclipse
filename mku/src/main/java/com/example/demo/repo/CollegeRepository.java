package com.example.demo.repo;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.model.College;
//import com.example.demo.model.User;

public interface CollegeRepository extends CrudRepository<College, Integer>{

//	@Query("SELECT u FROM User u WHERE u.userName = ?1 and u.password = ?2")
//	User findByUsernameAndPassword(String userName, String password);

}
