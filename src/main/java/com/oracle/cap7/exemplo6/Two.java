package com.oracle.cap7.exemplo6;

public class Two implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Two");
	}

}
