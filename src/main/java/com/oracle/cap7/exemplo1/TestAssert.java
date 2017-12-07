package com.oracle.cap7.exemplo1;

public class TestAssert {
	
	public void methodA(int num) {
		assert (num >= 0);
	}
	
	public void doStuff(int y, int x) {
		assert (y > x);
	}
	
	public void doStuff2(int y, int x) {
		assert (y > x) : x;
		
	}
	
	public static void main(String[] args) {
//		new TestAssert().methodA(-5);
		new TestAssert().doStuff2(0, 1);
	}
	
}
