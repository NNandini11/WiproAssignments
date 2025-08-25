package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.User;

public interface UserService {
	
	public User addUser(User u);
	public User getUser(Long id);
	public List<User> getAllUsers();
	public User updateUser(Long id,User u);
	public String deleteUser(Long id);
	public User patchUpdate(Long id,User u);
	public List<User> getUserName(String name);

}
