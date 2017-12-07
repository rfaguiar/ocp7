package com.oracle.cap8.autoavaliaca.exercicio22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\S");
		Matcher m = p.matcher("w1w w$ &#w1");
		
		while(m.find()) {
			System.out.print(m.start() + " ");
		}
		
	}
	
}
