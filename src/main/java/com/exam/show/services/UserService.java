package com.exam.show.services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
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
	
	public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        System.out.println("The user password is: " + user.getPassword());
        return userRepository.save(user);
    }
    
	
	
	
	public List<User> findAll() {
		
		return userRepository.findAll();
	}

}