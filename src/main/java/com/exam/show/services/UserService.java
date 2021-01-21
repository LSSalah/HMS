package com.exam.show.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.show.models.User;
import com.exam.show.repositories.UserRepository;


@Service("userService")
public class UserService {

	private UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
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
	
<<<<<<< HEAD
	public User findById(Long id) {
		return userRepository.findById(id).orElse(null);
	}
	
=======
>>>>>>> 5483a39d893dabd2e5800b262d2368dbed997035
	public List<User> findAll() {
		
		return userRepository.findAll();
	}

}