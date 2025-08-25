package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.exceptions.USER_NOT_FOUND_EXCEPTION;
import com.example.demo.repositories.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository urepo;
	

	@Override
	public User addUser(User u) {
		
		return  urepo.save(u);
	}

	@Override
	public User getUser(Long id) {
		log.info("Asking to database with id  details {},",id);
		User u=urepo.findById(id).get();
		log.info("getting details from database with id {},{}",id,u);
		return u;
	}

	@Override
	public List<User> getAllUsers() {
		return urepo.findAll();
	}

	@Override
	public User updateUser(Long id, User u) {
	    User existedUser = urepo.findById(id)
	        .orElseThrow(() -> new USER_NOT_FOUND_EXCEPTION("User with that id Not Present! " + id));

	    existedUser.setName(u.getName());
	    existedUser.setEmail(u.getEmail());

	    return urepo.save(existedUser);
	}


	@Override
	public String deleteUser(Long id) {
	    urepo.deleteById(id); 
	    return "User with ID " + id + " has been deleted successfully!";
	}

	@Override
	public User patchUpdate(Long id,User u) {
		User existedUser=urepo.findById(id)
		  .orElseThrow(() -> new RuntimeException("User with that id Not Present! " + id));
		if(u.getName()!=null)     
	      {
	    	  existedUser.setName(u.getName());
	      }
	      if(u.getEmail()!=null)
	      {
	    	  existedUser.setEmail(u.getEmail());
	      }
	
	return urepo.save(existedUser);
	}

	@Override
	public List<User> getUserName(String name) {
		 return urepo.findByName(name);
	
	}

	
	

}
