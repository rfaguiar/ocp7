package com.oracle.cap8.autoavaliaca.exercicio48;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
	
	public static void main(String[] args) {
		String s0 = "\\w";
		String s1 = "a 1 56 _Z";
		
		Pattern p = Pattern.compile(s0);
		Matcher m = p.matcher(s1);
		
		System.out.println("source: " + s1);
		System.out.println(" index: 0123456789");
		System.out.println("pattern: " + m.pattern());
		System.out.println("expression: ");
		
		for (;m.find();) {
			System.out.println(m.start() + " - " + m.end() + ": " + m.group());
		}
		
		
	}
}
