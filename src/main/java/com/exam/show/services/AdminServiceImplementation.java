package com.exam.show.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.show.models.Admin;
import com.exam.show.repositories.AdminRepository;
import com.exam.show.repositories.UserRepository;

@Service
public class AdminServiceImplementation implements AdminService {

	private AdminRepository adminRepository;

	//inject employee dao
	@Autowired   //Adding bean id @Qualifier
	public AdminServiceImplementation( AdminRepository obj)
	{
		adminRepository=obj;

	private UserRepository userRepository;
	//inject employee dao
	@Autowired   //Adding bean id @Qualifier
	public AdminServiceImplementation( AdminRepository obj,UserRepository userRepository)
	{
		this.adminRepository=obj;
		this.userRepository = userRepository;

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

	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	public void deleteDoctor(Long id) {
		userRepository.deleteById(id);
	}
	
}
