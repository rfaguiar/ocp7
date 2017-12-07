package com.oracle.cap7.exemplo8;

public class Suppressed {

	public static void main(String[] args) {
		
		try (Bad b1 = new Bad("1"); Bad b2 = new Bad("2")) {
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.out.println("suppressed: " + t);
			}
		}
		
	}
	
}
