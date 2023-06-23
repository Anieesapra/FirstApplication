package com.myfirstProject.myFirstProject.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myfirstProject.myFirstProject.Demo;
import com.myfirstProject.myFirstProject.dao.StudentDAO;
import com.myfirstProject.myFirstProject.model.Books;
import com.myfirstProject.myFirstProject.model.Student;
@Component
public class StudentDAOImpl implements StudentDAO{
@Autowired
Demo demo;

	@Override
	public void savekrdeBhai(Student student) {
		PreparedStatement st = null;
        try {
            st = demo.getsqlConnection().prepareStatement("insert into student values(?,?,?,?,?)");
            st.setInt(1, student.getId());
            st.setString(2, student.getName());
            st.setString(3,student.getStandard());
            st.setString(4, student.getSection());
            st.setString(5, student.getIssueDate());

            int i = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
          
        	e.printStackTrace();
        }

        System.out.println("ho gya m save");
    }



@Override
public Student getStudentByID(String id) {
	String query= "select * from student where PersonID="+id;
	Statement st;
	Student student=new Student();
	try {
		st = demo.getsqlConnection().createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		student.setId(rs.getInt("PersonID"));
		student.setName(rs.getString("FirstName"));
		student.setStandard(rs.getString("LastName"));
		student.setSection(rs.getString("Address"));
		student.setIssueDate(rs.getString("City"));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return student;
}
@Override
public Student updateStudentById(String id, String updateColumn ) {
	PreparedStatement ps = null;
	try {
		ps = demo.getsqlConnection().prepareStatement("update student set FirstName =? where PersonID= ?");
		ps.setInt(2, Integer.parseInt(id));
		ps.setString(1,  updateColumn);
		int i = ps.executeUpdate();
		ps.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String query= "select * from student where PersonID="+id;
	Statement st;
	Student student=new Student();
	try {
		st = demo.getsqlConnection().createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		student.setId(rs.getInt("PersonID"));
		student.setName(rs.getString("FirstName"));
	    student.setStandard(rs.getString("LastName"));
		student.setSection(rs.getString("Address"));
		student.setIssueDate(rs.getString("City"));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return student;
}
@Override
	public boolean deleteStudentById(String id) {
		
	PreparedStatement ps = null;
	try {
		ps = demo.getsqlConnection().prepareStatement("delete from student where PersonId= ?");
		ps.setString(1, id);
		
		int i = ps.executeUpdate();
		ps.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
	return true;
}
}
