package com.oracle.cap10.exemplo7;

import com.oracle.cap10.exemplo6.Book;
import com.oracle.cap10.exemplo6.BookDAO;

public class Student {

	public static void main(String[] args) {
		Factory factory = new FactoryImpl();
		BookDAO dao = factory.createDAO();
		Book book = new Book();
		
		book.setIsbn("123456789");
		dao.create(book);
		
		
	}
	
}
