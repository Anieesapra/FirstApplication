package com.myfirstProject.myFirstProject.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myfirstProject.myFirstProject.Demo;
import com.myfirstProject.myFirstProject.dao.BookDAO;
import com.myfirstProject.myFirstProject.model.Books;

@Component
public class BookDAOImpl implements BookDAO {
	@Autowired
	Demo demo;

	@Override
	public void savekrdeBhai(Books book) {

		PreparedStatement st = null;
		try {
			st = demo.getsqlConnection().prepareStatement("insert into books values(?,?,?,?,?)");
			st.setInt(1, book.getId());// 1 specifies the first parameter in the query
			st.setString(2,  book.getName());
			st.setString(3, book.getStudentName());
			st.setString(4,book.getPublisher());
			st.setString(5, book.getDoi());
			
			int i = st.executeUpdate();
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("ho gya m save");
	}

	@Override
	public Books getBooksByID(String id) {
		String query= "select * from books where PersonID="+id;
		Statement st;
		Books book=new Books();
		try {
			st = demo.getsqlConnection().createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			book.setId(rs.getInt("PersonID"));
			book.setName(rs.getString("FirstName"));
			book.setPublisher(rs.getString("LastName"));
			book.setDoi(rs.getString("Address"));
			book.setStudentName(rs.getString("City"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}

	@Override
	public Books updateBookById(String id, String updateColumn ) {
		PreparedStatement ps = null;
		try {
			ps = demo.getsqlConnection().prepareStatement("update books set FirstName =? where PersonID= ?");
			ps.setInt(2, Integer.parseInt(id));
			ps.setString(1,  updateColumn);
			int i = ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query= "select * from books where PersonID="+id;
		Statement st;
		Books book=new Books();
		try {
			st = demo.getsqlConnection().createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			book.setId(rs.getInt("PersonID"));
			book.setName(rs.getString("FirstName"));
			book.setPublisher(rs.getString("LastName"));
			book.setDoi(rs.getString("Address"));
			book.setStudentName(rs.getString("City"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return book;
	}

}
