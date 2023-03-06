package com.instagram.insta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.insta.model.User;
import com.instagram.insta.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	//add user
	public User addUser(User newUser) {
		return userRepository.save(newUser);
	}
	
	//get all 
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
	
	//find by id
	public User getUserById(int userId) {
		return userRepository.findById(userId).get();
	}
	
	//update user
	public void updateUserById(int userId, User newUser) {
		User user = userRepository.findById(userId).get();
		user.setUserId(newUser.getUserId());
		user.setAge(newUser.getAge());
		user.setEmail(newUser.getEmail());
		user.setFirstName(newUser.getFirstName());
		user.setLastName(newUser.getLastName());
		user.setPhoneNumber(newUser.getPhoneNumber());
		
		userRepository.save(user);
	}
	
	//delete
	public void deleteUserById(int userId) {
		userRepository.deleteById(userId);
	}

}
