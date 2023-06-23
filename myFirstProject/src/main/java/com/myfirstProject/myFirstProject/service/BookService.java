package com.myfirstProject.myFirstProject.service;

import com.myfirstProject.myFirstProject.model.Books;

public interface BookService {

	
	void save(Books book);
	
	Books getBooksByID(String id );
	
	Books updateBookById(String id, String updateColumn);
}
