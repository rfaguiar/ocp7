package com.oracle.cap8.autoavaliaca.exercicio35;

import java.util.StringTokenizer;

public class STest {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("a bc d e");
		System.out.println("\n " + st.countTokens());
		
		while(st.hasMoreElements()) {
			System.out.print(">" + st.nextToken() + "< ");
		}
		System.out.println("\n " + st.countTokens());
		
		StringTokenizer st2 = new StringTokenizer("a b cab a ba d", "a");
		System.out.println("\n " + st2.countTokens());
		
		while(st2.hasMoreTokens()) {
			System.out.print(">" + st2.nextToken() + "< ");
		}
		System.out.println("\n " + st2.countTokens());
		
	}
	
}
