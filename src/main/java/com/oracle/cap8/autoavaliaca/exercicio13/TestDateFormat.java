package com.oracle.cap8.autoavaliaca.exercicio13;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class TestDateFormat {

	public static void main(String[] args) {
		
		Date d1 = new Date(1_000_000_000_000L);
		System.out.println("d1 = " + d1.toString());
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		
		String s = df.format(d1);
		System.out.println(s);
		
		try {
			Date d2 = df.parse(s);
			System.out.println("parsed " + d2.toString());
		} catch (ParseException e) {
			System.out.println("parse exc");
		}
		
	}
}
