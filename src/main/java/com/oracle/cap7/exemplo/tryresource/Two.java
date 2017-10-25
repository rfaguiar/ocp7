package com.oracle.cap7.exemplo.tryresource;

public class Two implements AutoCloseable {

	@Override
	public void close() {
		System.out.println("Close - Two");
	}

}
