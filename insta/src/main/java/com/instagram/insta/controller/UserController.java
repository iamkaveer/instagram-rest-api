package com.instagram.insta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.insta.model.User;
import com.instagram.insta.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	
	@PostMapping("/add-user")
	public User addUsers(@RequestBody User newUser) {
		return userService.addUser(newUser);
	}
	
	@GetMapping("/find-all")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@GetMapping("/find-by-id/{id}")
	public User getUsersById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	@PutMapping("/update-user/{id}")
	public void updateUsersById(@PathVariable int id, @RequestBody User newUser) {
		userService.updateUserById(id, newUser);
	}
	
	@DeleteMapping("/delete-user/{id}")
	public void deleteUsersById(@PathVariable int id) {
		userService.deleteUserById(id);
	}
    
}
