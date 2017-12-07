package com.oracle.cap8.autoavaliaca.exercicio47;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		String s0 = "\\d";
		String s1 = "a12c3e456f";
		
		Pattern p = Pattern.compile(s0);
		Matcher m = p.matcher(s1);
		
		System.out.println("source: " + s1);
		System.out.println(" index: 0123456789");
		System.out.println("expression: " + m.pattern());
		System.out.println("match positions: ");
		
		for(;m.find();) {
			System.out.println(m.start() + " - " + m.end() + ": " + m.group());
		}
	}
}
