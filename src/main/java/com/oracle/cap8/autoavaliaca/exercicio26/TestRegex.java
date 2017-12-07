package com.oracle.cap8.autoavaliaca.exercicio26;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[a-cA-C]");
		Matcher m = p.matcher("cafeBABE");
	
		while(m.find()) {
			System.out.print(m.start() + " ");
		}
	}
	
}
