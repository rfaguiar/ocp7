package com.oracle.cap10.exemplo14;

public class Student {
	public static void main(String[] args) {
		Factory factory = new FactoryImpl();
		BookDao dao = factory.createDao();
		Book book = new Book();
		dao.create(book);
		book.setTitle("Updated");
		dao.update(book);
		dao.remove(book);
		
	}
}
