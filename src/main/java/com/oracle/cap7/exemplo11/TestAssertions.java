package com.oracle.cap7.exemplo11;

public class TestAssertions {

	private int y;
	private int x;
	
	private void doStuff() {
		assert y > x;
	}
	
	public static void main(String[] args) {
		TestAssertions t = new TestAssertions();
		t.y = -1;
		t.doStuff();
	}
	
	
}
