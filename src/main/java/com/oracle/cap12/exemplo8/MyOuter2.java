package com.oracle.cap12.exemplo8;

public class MyOuter2 {
	
	private String x = "Outer2";
	
	void doStuff() {
		
		final String z = "local variable";
		
		class MyInner {
			public void seeOuter() {
				System.out.println("Outer x is " + MyOuter2.this.x);
				System.out.println("Local var z is " + z);
			}
		}
		
		MyInner inner = new MyInner();
		inner.seeOuter();
	}
}
