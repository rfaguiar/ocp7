package com.oracle.cap11.exemplo10;

import java.util.ArrayList;
import java.util.Collections;

public class testSort1 {

	public static void main(String[] args) {
		
		ArrayList<String> stuff = new ArrayList<>();
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Vail");
		stuff.add("Aspen");
		stuff.add("Telluride");
		System.out.println("unsorted " + stuff);
		Collections.sort(stuff);
		System.out.println("sorted " + stuff);
		
	}
	
}
