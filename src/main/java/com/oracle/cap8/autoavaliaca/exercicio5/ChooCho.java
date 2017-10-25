package com.oracle.cap8.autoavaliaca.exercicio5;

import java.util.Locale;
import java.util.ResourceBundle;

public class ChooCho {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		ResourceBundle rb = ResourceBundle.getBundle("Train", new Locale("en", "UK"));
		System.out.println(rb.getString("ride") + " " + rb.getString("train"));
	}
}
