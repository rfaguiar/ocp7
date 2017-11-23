package com.oracle.cap11.exemplo33;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		boolean[] ba = new boolean[5];
		Set s = new HashSet();
		
		ba[0] = s.add("a");
		ba[1] = s.add(new Integer(42));
		ba[2] = s.add("b");
		ba[3] = s.add("a");
		ba[4] = s.add(new Object());
		
		for (boolean b : ba) {
			System.out.print(b + " ");
		}
		System.out.println();
		for (Object o : s) {
			System.out.print(o + " ");
		}
		
	}
}
