package com.oracle.cap7.exemplo7;

public class Supressed {

	public static void main(String[] args) {
		
		try (One one = new One()) {
			throw new Exception("Try");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.out.println("Suppressed: " + t);
			}
		}
		
	}
	
}
