package com.oracle.cap8.autoavaliaca.exercicio30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("a.c");
		Matcher m = p.matcher("ac abc a c");
		while(m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
		
	}
	
}
