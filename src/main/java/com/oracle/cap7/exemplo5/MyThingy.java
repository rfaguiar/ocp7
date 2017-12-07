package com.oracle.cap7.exemplo5;

public class MyThingy implements AutoCloseable {

	@Override
	public void close() {
		System.out.println("AutoClose MyThingy");
	}

}
