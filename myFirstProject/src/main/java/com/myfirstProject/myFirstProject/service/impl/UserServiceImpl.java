package com.myfirstProject.myFirstProject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myfirstProject.myFirstProject.dao.UserDao;
import com.myfirstProject.myFirstProject.model.User;
import com.myfirstProject.myFirstProject.service.UserService;
@Component
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public void save(User user) {
		userDao.savekrdeBhai(user);
		
	}

	@Override
	public boolean getAuthnetication(String email, String password) {
		// TODO Auto-generated method stub
		return userDao.authentication(email, password);
	}

	
}
