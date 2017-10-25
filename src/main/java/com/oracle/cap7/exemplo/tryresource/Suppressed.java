package com.oracle.cap7.exemplo.tryresource;

public class Suppressed {
	public static void main(String[] args) {
		try (One2 one = new One2()) {
			throw new Exception("Try");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.err.println("suppressed:" + t);
			}
		}
	}
}
