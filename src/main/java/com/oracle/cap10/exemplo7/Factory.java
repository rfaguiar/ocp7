package com.oracle.cap10.exemplo7;

import com.oracle.cap10.exemplo6.BookDAO;

public abstract class Factory {
	public abstract BookDAO createDAO();
}
