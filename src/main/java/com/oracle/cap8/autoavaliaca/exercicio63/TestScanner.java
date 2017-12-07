package com.oracle.cap8.autoavaliaca.exercicio63;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		boolean b2, b;
		int i;
		String s, hits = " ";
		try (
			Scanner s1 = new Scanner("1true 34 hi");
			Scanner s2 = new Scanner("1true 34 hi");
		) {
			while (b = s1.hasNext()) {
				System.out.print(s1.next());
			}
			
			System.out.println();
			
			while (b = s2.hasNext()) {
				if (s2.hasNextInt()) {
					System.out.print(s2.nextInt());
				} else if (s2.hasNextBoolean()) {
					System.out.print(s2.nextBoolean());
				} else {
					System.out.print(s2.next());
				}
			}
		}
		
		
	}
}
