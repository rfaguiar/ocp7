package com.oracle.cap8.autoavaliaca.exercicio56;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		String s0 = "proj1([^,])*";
		String s1 = "proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java";
		
		Pattern p = Pattern.compile(s0);
		Matcher m = p.matcher(s1);
		
		System.out.println("source: " + s1);
		System.out.println(" index: 0123456789");
		System.out.println("pattern: " + m.pattern());
		System.out.println("matchs positions: ");
		
		for(;m.find();) {
			System.out.println(m.start() + " - " + m.end() + ": >" + m.group() + "<");
		}
		
		
	}
}
