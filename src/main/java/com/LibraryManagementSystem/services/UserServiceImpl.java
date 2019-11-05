package com.LibraryManagementSystem.services;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LibraryManagementSystem.Repository.UserRepository;
import com.LibraryManagementSystem.model.UserBean;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void addUser(UserBean bean) {
		UserBean user = userRepository.save(bean);
		user.getId();
	}

	
}
