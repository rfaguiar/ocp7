package com.oracle.cap8.autoavaliaca.exercicio23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\b");
		Matcher m = p.matcher("w2w w$ &#w2");
		while(m.find()) {
			System.out.print(m.start() + " ");
		}
	}
	
}
