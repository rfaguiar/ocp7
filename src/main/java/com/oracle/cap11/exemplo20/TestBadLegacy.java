package com.oracle.cap11.exemplo20;

import java.util.ArrayList;
import java.util.List;

public class TestBadLegacy {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(4);
		myList.add(6);
		Inserter in = new Inserter();
		in.insert(myList);
		
	}
}
