package com.oracle.cap8.autoavaliaca.exercicio64;

import java.util.Locale;
import java.util.ResourceBundle;

public class WinchLanguage {

	public static void main(String[] args) {
		String s0 = "fr";
		
		Locale locale = new Locale(s0);
		ResourceBundle rb = ResourceBundle.getBundle("Labels", locale);
		System.out.println(rb.getString("hello"));
		
	}
}
