package com.myfirstProject.myFirstProject.service;

import java.util.List;

import com.myfirstProject.myFirstProject.model.Books;
import com.myfirstProject.myFirstProject.model.Student;

public interface StudentService {

	void save(Student student);

Student getStudentByID(String id );
Student updateStudentById(String id, String updateColumn);
boolean deleteStudentById(String id);
List<Student> getStudentBylist(String id );
}
