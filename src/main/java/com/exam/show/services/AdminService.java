package com.exam.show.services;


import java.util.List;

import com.exam.show.models.Admin;



public interface AdminService {


	public List<Admin> findByRole(String user);

	public Admin findByEmail(String user);
	
	public List<Admin> findAll();

	public void save(Admin admin);
	
}
