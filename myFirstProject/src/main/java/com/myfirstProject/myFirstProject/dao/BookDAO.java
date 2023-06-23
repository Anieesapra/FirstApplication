package com.myfirstProject.myFirstProject.dao;

import com.myfirstProject.myFirstProject.model.Books;

public interface BookDAO {

	void savekrdeBhai(Books book);
	

	Books getBooksByID(String id );
	
	Books updateBookById(String id, String updatecolumn);
}
