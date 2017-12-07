package com.oracle.cap8.autoavaliaca.exercicio18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatcher {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("abaaaba");
		
		System.out.println("\nsource: abaaaba" );
		System.out.println(" index: 01234567890123456\n");
		System.out.println("expression: " + m.pattern());
		System.out.print("match positions: ");
		
		while(m.find()) {
			System.out.print(m.start() + " ");
		}
		System.out.println();
		
	}
	
}
