package com.oracle.cap10.exemplo14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InMemoryBookDao implements BookDao {

	private Map<String, Book> bookstore = new HashMap<>();
	
	public Collection<Book> findAllBooks() {
		return bookstore.values();
	}
	
	public Book findBookByIsbn(Book book) {
		return bookstore.get(book.getIsbn());
	}
	
	public void create(Book book) {
		bookstore.put(book.getIsbn(), book);
	}
	
	public void remove(Book book) {
		bookstore.remove(book.getIsbn());
	}
	
	public void update(Book book) {
		
	}
	
}
