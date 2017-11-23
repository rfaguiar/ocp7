package com.oracle.cap11.exemplo19;

import java.util.ArrayList;
import java.util.List;

public class TestLegacy {
	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		
		myList.add(4);
		myList.add(6);
		
		Adder adder = new Adder();
		int total = adder.addAll(myList);
		System.out.println(total);
		
	}
}
