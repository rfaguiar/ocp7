package com.oracle.cap7.exemplo5;

public class TestTryResourceMult {

	public void reader() {
		try (MyResource mr = MyResource.createResource();
				MyThingy mt = mr.createThingy()) {
			
		}
	}
	
	public static void main(String[] args) {
		new TestTryResourceMult().reader();
	}
	
}
