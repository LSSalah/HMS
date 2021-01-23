package com.exam.show.controllers;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exam.show.models.Admin;
import com.exam.show.models.Appointment;
import com.exam.show.services.AdminServiceImplementation;
import com.exam.show.services.AppointmentServiceImplementation;



@Controller
@RequestMapping("/user")
public class UserController {

	private AppointmentServiceImplementation appointmentServiceImplementation;

	private AdminServiceImplementation adminServiceImplementation;
	
	@Autowired
	public UserController(AppointmentServiceImplementation obj1,AdminServiceImplementation obj ) {
		appointmentServiceImplementation= obj1;
		adminServiceImplementation=obj;
		 
	}
	
	@GetMapping("/index")
	public String index(Model model){
		
		// get last seen
		String username="";
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
		   username = ((UserDetails)principal).getUsername();
		  String Pass = ((UserDetails)principal).getPassword();
		  System.out.println("One + "+username+"   "+Pass);
		  
		  
		} else {
		 username = principal.toString();
		  System.out.println("Two + "+username);
		}
		
		Admin admin = adminServiceImplementation.findByEmail(username);
				 
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date now = new Date();  
		    
		         String log=now.toString();
		    
		         admin.setLastseen(log);
		         
		         adminServiceImplementation.save(admin);
		
		 
		         
		 Appointment obj=new Appointment();
		 
		 obj.setName(admin.getFirstName()+" "+admin.getLastName());
		 
		 obj.setEmail(admin.getEmail());
			
		 System.out.println(obj);
		 
		 model.addAttribute("app",obj);
		
		return "user/index";
	}
	
	@GetMapping("/profile")
	public String profile(Model model){
		
		// get last seen
		String username="";
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
		   username = ((UserDetails)principal).getUsername();
		  String Pass = ((UserDetails)principal).getPassword();
		  System.out.println("One + "+username+"   "+Pass);
		  
		  
		} else {
		 username = principal.toString();
		  System.out.println("Two + "+username);
		}
		
		Admin admin = adminServiceImplementation.findByEmail(username);
				 
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date now = new Date();  
		 
		 List<Appointment> list = appointmentServiceImplementation.findAll();
		 List<Appointment> newList = new ArrayList<>();
		         
		 for (Appointment appointment : list) {
			 if(appointment.getEmail().equals(admin.getEmail())) {
				 newList.add(appointment);
			 }
		}
		 Appointment obj=new Appointment();
		 
		 obj.setName(admin.getFirstName()+" "+admin.getLastName());
		 
		 obj.setEmail(admin.getEmail());
			
		 System.out.println(obj);
		 
		 model.addAttribute("app",obj);
		 model.addAttribute("profile",admin);
		 model.addAttribute("appList",newList);
		return "user/profile";
	}
	
	@PostMapping("/update-profile")
	public String updateProfile(@ModelAttribute("app") Admin admin) {
		
		adminServiceImplementation.save(admin);
		// use a redirect to prevent duplicate submissions
		return "redirect:/user/profile";
	}

	
	@PostMapping("/save-app")
	public String saveEmploye(@ModelAttribute("app") Appointment obj) {
		
		appointmentServiceImplementation.save(obj);
		
	
		// use a redirect to prevent duplicate submissions
		return "redirect:/user/index";
	}

	
	@GetMapping("/about")
	public String about(Model model){
		
		// get last seen
		String username="";
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
		   username = ((UserDetails)principal).getUsername();
		  String Pass = ((UserDetails)principal).getPassword();
		  System.out.println("One + "+username+"   "+Pass);
		  
		  
		} else {
		 username = principal.toString();
		  System.out.println("Two + "+username);
		}
		
		Admin admin = adminServiceImplementation.findByEmail(username);
				 
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date now = new Date();  
		    
		         String log=now.toString();
		    
		         admin.setLastseen(log);
		         
		         adminServiceImplementation.save(admin);
		
		 
		         
		 Appointment obj=new Appointment();
		 
		 obj.setName(admin.getFirstName()+" "+admin.getLastName());
		 
		 obj.setEmail(admin.getEmail());
			
		 System.out.println(obj);
		 
		 model.addAttribute("app",obj);
		 
		return "user/about";
	}
	

	
	@GetMapping("/contact")
	public String contact(Model model){
		
		// get last seen
		String username="";
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
		   username = ((UserDetails)principal).getUsername();
		  String Pass = ((UserDetails)principal).getPassword();
		  System.out.println("One + "+username+"   "+Pass);
		  
		  
		} else {
		 username = principal.toString();
		  System.out.println("Two + "+username);
		}
		
		Admin admin = adminServiceImplementation.findByEmail(username);
				 
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date now = new Date();  
		    
		         String log=now.toString();
		    
		         admin.setLastseen(log);
		         
		         adminServiceImplementation.save(admin);
		
		 
		         
		 Appointment obj=new Appointment();
		 
		 obj.setName(admin.getFirstName()+" "+admin.getLastName());
		 
		 obj.setEmail(admin.getEmail());
			
		 System.out.println(obj);
		 
		 model.addAttribute("app",obj);
		
		return "user/contact";
	}
	

	@GetMapping("/department-single")
	public String d(Model model){
		
		// get last seen
		String username="";
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
		   username = ((UserDetails)principal).getUsername();
		  String Pass = ((UserDetails)principal).getPassword();
		  System.out.println("One + "+username+"   "+Pass);
		  
		  
		} else {
		 username = principal.toString();
		  System.out.println("Two + "+username);
		}
		
		Admin admin = adminServiceImplementation.findByEmail(username);
				 
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date now = new Date();  
		    
		         String log=now.toString();
		    
		         admin.setLastseen(log);
		         
		         adminServiceImplementation.save(admin);
		
		 
		         
		 Appointment obj=new Appointment();
		 
		 obj.setName(admin.getFirstName()+" "+admin.getLastName());
		 
		 obj.setEmail(admin.getEmail());
			
		 System.out.println(obj);
		 
		 model.addAttribute("app",obj);

		
		return "user/department-single";
	}

	@GetMapping("/departments")
	public String dep(Model model){
		
		// get last seen
		String username="";
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
		   username = ((UserDetails)principal).getUsername();
		  String Pass = ((UserDetails)principal).getPassword();
		  System.out.println("One + "+username+"   "+Pass);
		  
		  
		} else {
		 username = principal.toString();
		  System.out.println("Two + "+username);
		}
		
		Admin admin = adminServiceImplementation.findByEmail(username);
				 
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date now = new Date();  
		    
		         String log=now.toString();
		    
		         admin.setLastseen(log);
		         
		         adminServiceImplementation.save(admin);
		
		 
		         
		 Appointment obj=new Appointment();
		 
		 obj.setName(admin.getFirstName()+" "+admin.getLastName());
		 
		 obj.setEmail(admin.getEmail());
			
		 System.out.println(obj);
		 
		 model.addAttribute("app",obj);
		
		return "user/departments";
	}

	@GetMapping("/doctor")
	public String doctor(Model model){
		
		// get last seen
		String username="";
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
		   username = ((UserDetails)principal).getUsername();
		  String Pass = ((UserDetails)principal).getPassword();
		  System.out.println("One + "+username+"   "+Pass);
		  
		  
		} else {
		 username = principal.toString();
		  System.out.println("Two + "+username);
		}
		
		Admin admin = adminServiceImplementation.findByEmail(username);
				 
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date now = new Date();  
		    
		         String log=now.toString();
		    
		         admin.setLastseen(log);
		         
		         adminServiceImplementation.save(admin);
		
		 
		         
		 Appointment obj=new Appointment();
		 
		 obj.setName(admin.getFirstName()+" "+admin.getLastName());
		 
		 obj.setEmail(admin.getEmail());
			
		 System.out.println(obj);
		 
		 model.addAttribute("app",obj);

		
		return "user/doctor";
	}
}
