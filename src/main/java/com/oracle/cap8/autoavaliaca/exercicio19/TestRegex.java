package com.oracle.cap8.autoavaliaca.exercicio19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("aba");
		Matcher m = p.matcher("abababa");
		
		while(m.find()) {
			System.out.print(m.start() + " ");
		}
		
	}
	
}
