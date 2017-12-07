package com.oracle.cap7.exemplo16;

public class Two implements AutoCloseable {

	@Override
	public void close() {
		System.out.println("Close - Two");
	}

}
