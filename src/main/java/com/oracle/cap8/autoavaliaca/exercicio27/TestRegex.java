package com.oracle.cap8.autoavaliaca.exercicio27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("0[xX][0-9a-fA-F]");
		Matcher m = p.matcher("12 0x 0x12 0Xf 0xg");
		
		while(m.find()) {
			System.out.print(m.start() + " ");
		}
		
	}
	
}
