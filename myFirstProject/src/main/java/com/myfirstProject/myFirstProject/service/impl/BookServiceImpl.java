package com.myfirstProject.myFirstProject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myfirstProject.myFirstProject.dao.BookDAO;

import com.myfirstProject.myFirstProject.model.Books;
import com.myfirstProject.myFirstProject.service.BookService;
@Component
public class BookServiceImpl  implements BookService{

	@Autowired
	BookDAO bookDAO;
	
	//@Autowired
	//StudentDAO studentDAO;
	
	@Override
	public void save(Books book) {
		
		System.out.println("let me call Dao layer ");
		bookDAO.savekrdeBhai(book);
	
	}

	@Override
	public Books getBooksByID(String id) {
		
		return bookDAO.getBooksByID(id);
	}

	@Override
	public Books updateBookById(String id, String updateColumn) {
		// TODO Auto-generated method stub
		return bookDAO.updateBookById(id, updateColumn);
	}

}
