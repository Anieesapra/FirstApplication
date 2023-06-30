package com.myfirstProject.myFirstProject.service;

import com.myfirstProject.myFirstProject.model.User;

public interface UserService {

	void save(User user);
	
	boolean getAuthnetication(String email, String password);
}
