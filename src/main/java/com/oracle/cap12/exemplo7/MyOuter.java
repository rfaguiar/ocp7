package com.oracle.cap12.exemplo7;

public class MyOuter {
	
	private int x = 7;
	
	public void makeInner() {
		MyInner in = new MyInner();
		in.seeOuter();
	}
	
	public class MyInner { 
		
		public void seeOuter() {
			System.out.println("Outer x is " + MyOuter.this.x );
		}
		
	}
	
	public static void main(String[] args) {
		MyOuter.MyInner inner = new MyOuter().new MyInner();
		inner.seeOuter();
	}
}
