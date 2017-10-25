package com.oracle.cap8.autoavaliaca.exercicio13;

import java.util.Scanner;

public class Looking {
	public static void main(String[] args) {
		String input = "1 2 a 3 45 6";
		Scanner sc = new Scanner(input);
		int x = 0;
		do {
			x = sc.nextInt();
			System.out.println(x + " ");
		} while (x!=0);
	}
}
