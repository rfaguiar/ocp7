package com.oracle.whilabs.io.exemplo5;

import java.io.Console;

public class Co {
	public static void main(String[] args) {
		
		Console con = System.console();
		String uname = con.readLine("User name: ");
		char[] p = con.readPassword("Password: ");
		
		System.out.println("Username: " + uname.toString());
		System.out.print("Password: ");
		for (char c : p) {
			System.out.print(c);
		}
	}
}
