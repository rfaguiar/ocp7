package com.oracle.cap7.exemplo.tryresource;

public class Suppressed2 {
	public static void main(String[] args) {
		try (Bad b1 = new Bad("1"); Bad b2 = new Bad("2")) {
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.err.println("suppressed: " + t);
			}
		}
	}
}
