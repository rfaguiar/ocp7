package com.oracle.cap10.exemplo6;

public class Student {
	
	public static void main(String[] args) {
		BookDAO dao = new InMemoryBookDAO();
		Book book = new Book();
		
		dao.create(book);
		book.setTitle("Updated");
		dao.update(book);
		dao.delete(book);
	}
	
}
