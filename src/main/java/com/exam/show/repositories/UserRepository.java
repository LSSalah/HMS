package com.exam.show.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exam.show.models.User;


@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, Long> {
	
	
	 User findByEmail(String email);
<<<<<<< HEAD
=======
	
>>>>>>> 5483a39d893dabd2e5800b262d2368dbed997035
	 User findByConfirmationToken(String confirmationToken);
	 
	  List<User> findAll();
}