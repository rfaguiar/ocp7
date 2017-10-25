package com.oracle.cap7.exemplo.tryresource;

public class One implements AutoCloseable {

	@Override
	public void close() {
		System.out.println("Close - One");
	}

}
