package com.exam.show.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exam.show.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
	List<User> findAll();
	User findByEmail(String email);
	
	User findByConfirmationToken(String confirmationToken);
	
}
