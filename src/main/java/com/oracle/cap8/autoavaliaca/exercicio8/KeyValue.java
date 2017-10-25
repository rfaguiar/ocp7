package com.oracle.cap8.autoavaliaca.exercicio8;

import java.util.Locale;
import java.util.ResourceBundle;

public class KeyValue {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("Bundle", Locale.getDefault());
		Object obj = rb.getObject("123");
		Object obj2 = rb.getString("123");
	}
}
