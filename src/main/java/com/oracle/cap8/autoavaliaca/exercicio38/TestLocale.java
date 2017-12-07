package com.oracle.cap8.autoavaliaca.exercicio38;

import java.util.Locale;

public class TestLocale {

	public static void main(String[] args) {
		
		Locale initial = Locale.getDefault();
		System.out.println(initial);
		
		Locale.setDefault(Locale.GERMANY);
		System.out.println(Locale.getDefault());
		
		Locale.setDefault(initial);
		System.out.println(Locale.getDefault());
		
	}
	
}
