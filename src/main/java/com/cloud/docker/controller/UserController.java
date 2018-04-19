package com.cloud.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.docker.POJO.User;
import com.cloud.docker.dao.UserDao;

@RestController
public class UserController {
	@Autowired
	private UserDao userDao;
	
	@GetMapping("/{id}")
	public User findById(@PathVariable Long id){
		User user = userDao.findOne(id);
		return user;
		
	}
}
