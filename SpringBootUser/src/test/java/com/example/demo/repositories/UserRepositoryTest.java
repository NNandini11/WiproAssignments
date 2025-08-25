package com.example.demo.repositories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.entities.User;

@DataJpaTest
class UserRepositoryTest {
	
	@Autowired
    private UserRepository urepo;
	
	@Test
	void testsaveUser() {
		  User u = new User(null, "nandini", "nandini123@gmail.com");
		  
		  User savedUser=urepo.save(u);
             Assertions.assertNotNull(savedUser.getId());
		
	}



}
