package com.oracle.cap7.exemplo12;

public class TestAssertions {

	private int x;
	private int y;
	
	public void doStuff() {
		assert(y > x): "y is " + y + "x is " + x;
		
	}
	
	public static void main(String[] args) {
		TestAssertions t = new TestAssertions();
		t.y = -1;
		t.doStuff();
	}
	
}
