package com.myfirstProject.myFirstProject.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myfirstProject.myFirstProject.Demo;
import com.myfirstProject.myFirstProject.dao.UserDao;
import com.myfirstProject.myFirstProject.model.Books;
import com.myfirstProject.myFirstProject.model.User;

@Component
public class UserDaoImpl implements UserDao {
	@Autowired
	Demo demo;

	@Override
	public void savekrdeBhai(User user) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		try {
			st = demo.getsqlConnection().prepareStatement("insert into Form values(?,?,?)");
			st.setInt(1, user.getId());
			st.setString(2, user.getEmail());
			st.setString(3, user.getPassword());

			int i = st.executeUpdate();
			st.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		System.out.println("ho gya m save");
	}

	@Override
	public boolean authentication(String username, String password) {
		String query = "select * from Form where email='" + username + "' and password='" + password+"'";
		Statement st;
      boolean authentication =false;
		try {
			st = demo.getsqlConnection().createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next()==true)
			{
				authentication=true;
			}
		} catch (Exception e) {

		}return authentication;
	}

}
