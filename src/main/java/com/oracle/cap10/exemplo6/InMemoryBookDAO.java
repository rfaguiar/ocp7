package com.oracle.cap10.exemplo6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InMemoryBookDAO implements BookDAO {
	
	private static Map<String, Book> bookStore = new HashMap<>();
	
	public Collection<Book> findAllBooks() {
		return bookStore.values();
	}
	
	public Book findBookByIsbn(String isbn) {
		return bookStore.get(isbn);
	}
	
	public void create(Book book) {
		bookStore.put(book.getIsbn(), book);
	}
	
	public void delete(Book book) {
		bookStore.remove(book.getIsbn());
	}
	
	public void update(Book book) { }
	
}
