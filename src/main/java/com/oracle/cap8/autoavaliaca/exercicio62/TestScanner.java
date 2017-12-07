package com.oracle.cap8.autoavaliaca.exercicio62;

public class TestScanner {

	public static void main(String[] args) {
		String s0 = "\\d";
		String s1 = "ab,cd5b,6x,z4";
		
		String[] tokens = s1.split(s0);
		
		for (String token : tokens) {
			System.out.println(token);
		}
		
		
	}
}
