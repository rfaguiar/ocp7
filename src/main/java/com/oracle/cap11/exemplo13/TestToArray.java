package com.oracle.cap11.exemplo13;

import java.util.ArrayList;
import java.util.List;

public class TestToArray {

	public static void main(String[] args) {
		
		List<Integer> iL = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			iL.add(i);
		}
		
		Object[] oa = iL.toArray();
		Integer[] ia2 = new Integer[3];
		
		ia2 = iL.toArray(ia2);
		
	}
}
