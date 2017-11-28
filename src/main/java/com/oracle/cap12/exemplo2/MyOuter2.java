package com.oracle.cap12.exemplo2;

public class MyOuter2 {
	
	private String x = "Outer2";
	
	public void doStuff() {
		final String z = "local method variable";//não compila sem final por ser usada na classe interna de metodo
		
		class MyInner {			
			public void seeOuter() {
				System.out.println("Outer x is " + MyOuter2.this.x); 
				System.out.println("Local var z is " + z);
			}
		}
		
		MyInner mi = new MyInner();
		mi.seeOuter();
	}
	
	public static void main(String[] args) {
		
		MyOuter2 m = new MyOuter2();
		m.doStuff();
		
	}
	
}
