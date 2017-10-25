package com.oracle.cap8.autoavaliaca.exercicio3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quetico {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\W");
		Matcher m = p.matcher("^23 *$76 bc");
		System.out.print("match positions: ");
		while(m.find()) {
			System.out.print(m.start() + " ");
		}
		System.out.println("");
	}
}
