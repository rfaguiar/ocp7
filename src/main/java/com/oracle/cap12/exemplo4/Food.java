package com.oracle.cap12.exemplo4;

public class Food {
	Cookable c = new Cookable() {
		
		public void cook() {
			System.out.println("anonymous cookable implementer");
		}
	};
	
	public static void main(String[] args) {
		new Food().c.cook();
	}
}
