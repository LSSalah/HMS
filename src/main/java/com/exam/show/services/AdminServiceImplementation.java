package com.exam.show.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.show.models.Admin;
import com.exam.show.repositories.AdminRepository;
<<<<<<< HEAD
import com.exam.show.repositories.UserRepository;
=======
>>>>>>> 5483a39d893dabd2e5800b262d2368dbed997035


@Service
public class AdminServiceImplementation implements AdminService {

	private AdminRepository adminRepository;
<<<<<<< HEAD
	private UserRepository userRepository;
	//inject employee dao
	@Autowired   //Adding bean id @Qualifier
	public AdminServiceImplementation( AdminRepository obj,UserRepository userRepository)
	{
		this.adminRepository=obj;
		this.userRepository = userRepository;
=======

	//inject employee dao
	@Autowired   //Adding bean id @Qualifier
	public AdminServiceImplementation( AdminRepository obj)
	{
		adminRepository=obj;
>>>>>>> 5483a39d893dabd2e5800b262d2368dbed997035
	}
	
	@Override
	public List<Admin> findAll() {
		return adminRepository.findAll();
	}

	@Override
	public void save(Admin admin)
	{
		
		adminRepository.save(admin);
	}

	@Override
	public Admin findByEmail(String user) {
		// TODO Auto-generated method stub
		
		return adminRepository.findByEmail(user);
		
	}

	@Override
	public List<Admin> findByRole(String user) {
		
		return adminRepository.findByRole(user);
	}
<<<<<<< HEAD
	
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	public void deleteDoctor(Long id) {
		userRepository.deleteById(id);
	}
	
	
=======

>>>>>>> 5483a39d893dabd2e5800b262d2368dbed997035
	
}
