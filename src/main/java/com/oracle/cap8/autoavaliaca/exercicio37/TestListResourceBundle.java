package com.oracle.cap8.autoavaliaca.exercicio37;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestListResourceBundle {

	public static void main(String[] args) {
		
		Locale locale = new Locale("from Java", "CA");
		ResourceBundle rb = ResourceBundle.getBundle("Labels", locale);
		System.out.println(rb.getObject("hello"));
		
	}
	
	
}
