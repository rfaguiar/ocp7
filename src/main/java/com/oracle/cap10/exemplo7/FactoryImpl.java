package com.oracle.cap10.exemplo7;

import com.oracle.cap10.exemplo6.BookDAO;
import com.oracle.cap10.exemplo6.InMemoryBookDAO;
import com.oracle.cap12.exemplo5.Foo;

public class FactoryImpl extends Factory {
	
	public BookDAO createDAO() {

		Object o = new FactoryImpl();
		Factory f = new FactoryImpl();
		FactoryImpl i = new FactoryImpl();
		
		Foo fo = new Foo() {public void foof() {} };		
		
		o = f;
		o = i;
		o = fo;
		
		f = (Factory) o;
		f = i;
		f = (Factory) fo;
		
		i = (FactoryImpl) f;
		i = (FactoryImpl) o;
		i = (FactoryImpl) fo;
		
		
		if (Util.isTestMode()) {
			return new InMemoryBookDAO();	
		} else {
			return new OracleBookDAO();
		}
		
		
	}
	
}
