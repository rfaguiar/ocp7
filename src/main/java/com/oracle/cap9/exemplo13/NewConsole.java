package com.oracle.cap9.exemplo13;

import java.io.Console;

public class NewConsole {
	public static void main(String[] args) {
		
		String name = "";
		Console c = System.console(); //obtem o console
		char[] pw;
		pw = c.readPassword();//retorna a senha em uma array de char
		
		for (char ch : pw) {
			c.format("%c ", ch); //formata a saida
		}
		c.format("\n");
		
		MyUtility mu = new MyUtility();
		while (true) {
			name = c.readLine("%s", "input?: ");//retorna uma string
			c.format("output: %s \n", mu.doStuff(name));
		}
		
	}
}
