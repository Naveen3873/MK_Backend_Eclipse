package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.ColllegeResponse;

public interface ResponseRepository extends CrudRepository<ColllegeResponse, Integer> {

}
