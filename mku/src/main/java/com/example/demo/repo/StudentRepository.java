package com.example.demo.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

	@Query("SELECT st FROM Student st WHERE st.userName = ?1 and st.password = ?2")
	public Student findByUsernameAndPassword(String userName, String password);
}
