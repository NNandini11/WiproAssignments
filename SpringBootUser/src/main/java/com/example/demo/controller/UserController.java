package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;



@Slf4j
@RestController
public class UserController {
	@Autowired
	UserService userv;
	@PostMapping("/add")
	 public User addingIntoService( @Valid @RequestBody User u) {
		
		return userv.addUser(u);
		 
	 }
	
	 @GetMapping("/get/{id}")
	 public User gettingUser( @PathVariable Long id) {
		 log.info("Fetching user Details with id {}:",id);
		 User response=userv.getUser(id);
		 log.info("response coming from service  for user id {} :{}",id,response);
		 
		return response;
		 
	 }
	 
	 @GetMapping("/getallusers")
	 public List<User> gettingAllUsers(){
		return userv.getAllUsers();
		 
	 }
	 @PutMapping("/update/{id}")
	 public User updatingUser( @PathVariable Long id,  @RequestBody User u) {
		return userv.updateUser(id,u);
		 
	 }
	 
	 @DeleteMapping("/delete/{id}")
	 public String deletingUSer(@PathVariable Long id) {
		 userv.deleteUser(id);
		 return "User Deleted Successfully";
	 }
	 @PatchMapping("/patch/{id}")
	 public User patchingUser( @PathVariable Long id,  @RequestBody User u) {
		return userv.patchUpdate(id,u);
		 
	 }
	 @GetMapping("/gettingname/{name}")
	 public List<User> getUserByName(@PathVariable String name) {
		return userv.getUserName(name);
		 
	 }
}
