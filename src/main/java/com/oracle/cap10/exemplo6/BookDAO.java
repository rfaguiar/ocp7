package com.oracle.cap10.exemplo6;

import java.util.Collection;

public interface BookDAO {
	
	public Collection<Book> findAllBooks();
	
	public Book findBookByIsbn(String isbn);
	
	public void create(Book book);
	
	public void delete(Book book);
	
	public void update(Book book);
}
