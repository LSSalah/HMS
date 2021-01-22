package com.exam.show.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exam.show.models.User;


@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Long> {
	
	
	 User findByEmail(String email);
<<<<<<< HEAD
	
	 User findByConfirmationToken(String confirmationToken);
	 
	  List<User> findAll();
=======
	 User findByConfirmationToken(String confirmationToken);
	 List<User> findAll();
>>>>>>> f69d95e14609bee378bb9f215b53fd61934d0b98
}