package com.oracle.cap8.autoavaliaca.exercicio12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Archie {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("ab2c4d67");
		int count = 0;
		while (m.find()) 
			count++;
		System.out.print(count);
	}
}
