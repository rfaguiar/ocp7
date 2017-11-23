package com.oracle.cap11.exemplo26;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		List<String> test = new ArrayList<String>();
		String s = "hi";
		test.add("string");
		test.add(s);
		test.add(s+s);
		
		System.out.println("size " + test.size());
		System.out.println("contains 42 " + test.contains(42));
		System.out.println("contains hihi " + test.contains("hihi"));
		test.remove("hi");
		System.out.println("size " + test.size());
	}
}
