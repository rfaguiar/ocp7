package com.oracle.cap7.exemplo10;

public class TestAssertions {

	private int x;
	
	private void methodA(int num) {
		assert (num >= x);
		useNum(num + x);
	}

	private void useNum(int i) {
		System.out.println("num " + x);
	}
	
	public static void main(String[] args) {
		TestAssertions t = new TestAssertions();
		t.methodA(-1);
	}
	
}
