package com.oracle.cap11.exemplo38;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestLegacy {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		
		myList.add(4);
		myList.add(6);

		Inserter in = new Inserter();
		in.insert(myList);
		
		Adder adder = new Adder();
		int total = adder.addAll(myList);
		System.out.println(total);
		
	}
	
	static class Adder {
		public int addAll(List list) {
			Iterator it = list.iterator();
			int total = 0;
			while (it.hasNext()) {
				int i = ((Integer) it.next()).intValue();
				total += i;
			}
			return total;
		}
	}
	
	static class Inserter {
		public void insert(List list) {
			list.add("42");
		}
	}
}
