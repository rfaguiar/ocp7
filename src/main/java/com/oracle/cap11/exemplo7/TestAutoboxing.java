package com.oracle.cap11.exemplo7;

import java.util.ArrayList;
import java.util.List;

public class TestAutoboxing {
	public static void main(String[] args) {
		
		List myInts = new ArrayList();
		myInts.add(new Integer(42));//antes do java 5
		myInts.add(42);//apos java5
		
	}
}
