package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.College;
@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {
	
	//Spring Data JPA automatically detects and creates implementations for interfaces that extend these repository types during component scanning — even without @Repository.
}
