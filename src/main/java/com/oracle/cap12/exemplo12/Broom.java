package com.oracle.cap12.exemplo12;

public abstract class Broom {
	static class B2 {
		public void goB2 () {
			System.out.println("hi 2");
		}
	}
	
	public static void main(String[] args) {
		BigOuter.Nest n = new BigOuter.Nest();
		n.go();
		
		B2 b2 = new B2();
		b2.goB2();
	}
}
