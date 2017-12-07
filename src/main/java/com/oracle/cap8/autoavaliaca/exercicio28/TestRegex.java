package com.oracle.cap8.autoavaliaca.exercicio28;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("1 a12 234b");
		
		while(m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
		
	}
}