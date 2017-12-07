package com.oracle.cap8.autoavaliaca.exercicio33;

public class SplitTest {

	public static void main(String[] args) {
		
		String[] tokens = "abc5 ccc 45 @".split("\\d");
		System.out.println("count " + tokens.length);
		for (String s : tokens) {
			System.out.println(">" + s + "<");
		}
		
	}
	
}
