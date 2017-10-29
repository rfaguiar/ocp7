package com.oracle.whilabs.io.exemplo7;

import java.io.Console;

public class Co {
	public static void main(String[] args) {
		Console co = System.console();
		char[] c = co.readPassword("Enter the password");
//		System.out.write("Your password is: ");//não compila
		for (int i : c) {
			System.out.write(i);
			System.out.flush();
		}
		
	}
}
