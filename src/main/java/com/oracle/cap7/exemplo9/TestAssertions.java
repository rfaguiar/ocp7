package com.oracle.cap7.exemplo9;

public class TestAssertions {

	private int x;
	
	private void methodA(int num) {
		if (num >= 0) {
			useNum(num + x);
		} else {
			System.out.println("Yikes! num is a negative nujmber! " + num);
		}
	}

	private void useNum(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
