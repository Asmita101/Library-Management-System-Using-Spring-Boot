package com.LibraryManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.LibraryManagementSystem.model.UserBean;
import com.LibraryManagementSystem.services.UserService;

@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String test() {
		return "Test is success";
	}
	
	@PostMapping("/save-user")
	public String addUser(@RequestBody UserBean bean){
		
		userService.addUser(bean);
		return "Success fully Save";
		
	}
	
	
}

