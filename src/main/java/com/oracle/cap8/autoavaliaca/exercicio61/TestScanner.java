package com.oracle.cap8.autoavaliaca.exercicio61;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		String s0 = "\\d\\d";
		String s1 = "1b2c335f456";
		
		System.out.println("input: ");
		System.out.flush();
		
		try(Scanner s = new Scanner(System.in)) {
			String token;
			do {
				token = s.findInLine(s0);
				System.out.println("found " + token);
			} while (token != null);
		}
		
		
	}
}
