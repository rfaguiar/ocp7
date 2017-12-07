package com.oracle.cap8.autoavaliaca.exercicio29;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("proj1([^,])*");
		Matcher m = p.matcher("proj3.txt,proj1sched.pdf,proj1,proj2,pro1.java");
		
		while(m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
		
	}
	
}
