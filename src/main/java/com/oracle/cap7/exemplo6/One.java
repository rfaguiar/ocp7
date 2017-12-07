package com.oracle.cap7.exemplo6;

public class One implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("One");
		
	}

}
