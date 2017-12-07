package com.oracle.cap7.exemplo5;

public class MyResource implements AutoCloseable {

	public static MyResource createResource() {
		return new MyResource();
	}


	public MyThingy createThingy() {
		return new MyThingy();
	}

	@Override
	public void close() {
		System.out.println("AutoClose MyResource");
	}
}
