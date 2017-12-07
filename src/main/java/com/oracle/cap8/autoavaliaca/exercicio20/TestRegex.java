package com.oracle.cap8.autoavaliaca.exercicio20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher("a12c3e456f");
		
		while(m.find()) {
			System.out.print(m.start() + " ");
		}
		
	}
	
}
