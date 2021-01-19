package com.exam.show.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.show.models.User;
import com.exam.show.repositories.UserRepo;



@Service("userService")
public class UserService {

	private UserRepo userRepository;

	@Autowired
	public UserService(UserRepo userRepository) {
		this.userRepository = userRepository;
	}
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public User findByConfirmationToken(String confirmationToken) {
		return userRepository.findByConfirmationToken(confirmationToken);
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	public List<User> findAll() {
		
		return userRepository.findAll();
	}

}