package com.myfirstProject.myFirstProject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myfirstProject.myFirstProject.dao.StudentDAO;
import com.myfirstProject.myFirstProject.model.Books;
import com.myfirstProject.myFirstProject.model.Student;
import com.myfirstProject.myFirstProject.service.StudentService;

@Component
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentDAO studentDAO;
	@Override
	public void save(Student student) {
		System.out.println("let me call Dao layer ");
		studentDAO.savekrdeBhai(student);
	}
	@Override
	public Student getStudentByID(String id) {
		return studentDAO.getStudentByID(id);
	}
	@Override
	public Student updateStudentById(String id, String updateColumn) {
		return studentDAO.updateStudentById(id, updateColumn);
	}
@Override
public Student deleteStudentById(String id) {
	return studentDAO.deleteStudentById(id);
}
}
