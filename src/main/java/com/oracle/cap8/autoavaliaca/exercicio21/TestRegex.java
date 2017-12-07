package com.oracle.cap8.autoavaliaca.exercicio21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\w");
		Matcher m = p.matcher("a 1 56 _Z");
		while(m.find()) {
			System.out.print(m.start() + " ");
		}
		
	}
	
}
