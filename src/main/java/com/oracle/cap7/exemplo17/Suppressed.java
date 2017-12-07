package com.oracle.cap7.exemplo17;

public class Suppressed {
	
	public static void main(String[] args) {
		
		try (Bad bad = new Bad("1"); Bad bad1 = new Bad("2")) {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.out.println("suppressed: " + t);
			}
		}
		
	}
	
}
