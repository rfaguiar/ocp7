package com.oracle.cap8.autoavaliaca.exercicio10;

public class Stone {
	public static void main(String[] args) {
		String s = "abc";
		System.out.println(">" + doStuff(s) + "<");
	}

	static String doStuff(String s) {
		s = s.concat(" ef h ");
		return s.trim();
	}
}
