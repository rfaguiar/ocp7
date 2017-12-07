package com.oracle.cap8.autoavaliaca.exercicio36;

import java.util.Locale;
import java.util.ResourceBundle;

public class WichLanguage {

	public static void main(String[] args) {
		
		System.out.println(getMsgBungle("en"));
		System.out.println(getMsgBungle("fr"));
		
	}
	
	public static String getMsgBungle(String Language) {
		Locale locale = new Locale(Language);
		ResourceBundle rb = ResourceBundle.getBundle("Labels", locale);
		return rb.getString("hello");
	}
}
