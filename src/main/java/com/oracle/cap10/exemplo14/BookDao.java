package com.oracle.cap10.exemplo14;

import java.util.Collection;

public interface BookDao {
	public Collection<Book> findAllBooks() ;
	
	public Book findBookByIsbn(Book book) ;
	
	public void create(Book book) ;
	
	public void remove(Book book) ;
	
	public void update(Book book) ;
}
