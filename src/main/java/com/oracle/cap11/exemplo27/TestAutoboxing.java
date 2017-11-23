package com.oracle.cap11.exemplo27;

public class TestAutoboxing {
	public static void main(String[] args) {
		
		Integer y = new Integer(567);
		int x = y.intValue();
		x++;
		y = new Integer(x);
		System.out.println("y = " + y);
		
		Integer y2 = new Integer(567);
		y2++;
		System.out.println("y = " + y);
		
	}
}
