package com.myfirstProject.myFirstProject.dao;

import com.myfirstProject.myFirstProject.model.User;

public interface UserDao {
	void savekrdeBhai(User user);
	
	boolean authentication(String username, String password);
}
