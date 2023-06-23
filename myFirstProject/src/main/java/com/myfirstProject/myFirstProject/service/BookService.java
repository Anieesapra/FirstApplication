package com.myfirstProject.myFirstProject.service;

import java.util.List;

import com.myfirstProject.myFirstProject.model.Books;

public interface BookService {

	
	void save(Books book);
	
	Books getBooksByID(String id );
	
	Books updateBookById(String id, String updateColumn);
	
	List<Books> getBooksBylist(String id );
	
}
