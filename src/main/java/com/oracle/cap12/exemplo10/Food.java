package com.oracle.cap12.exemplo10;

public class Food {
	
	Cookable c = new Cookable() {
		
		@Override
		public void cook() {
			System.out.println("anonymous cookable implementer");
		}
	};
}
