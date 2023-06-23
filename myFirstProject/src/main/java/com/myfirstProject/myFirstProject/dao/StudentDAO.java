package com.myfirstProject.myFirstProject.dao;

import com.myfirstProject.myFirstProject.model.Books;
import com.myfirstProject.myFirstProject.model.Student;

public interface StudentDAO {

	
	void savekrdeBhai(Student student);
	Student getStudentByID(String id );
	
	Student updateStudentById(String id, String updatecolumn);
	Student deleteStudentById(String id);
}
