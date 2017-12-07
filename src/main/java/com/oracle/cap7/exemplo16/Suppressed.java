package com.oracle.cap7.exemplo16;

public class Suppressed {
	
	public static void main(String[] args) {
		
		try (One one = new One()) {
			throw new Exception("Try");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.out.println("suppressed: " + t);
			}
		}
		
	}
	
}
