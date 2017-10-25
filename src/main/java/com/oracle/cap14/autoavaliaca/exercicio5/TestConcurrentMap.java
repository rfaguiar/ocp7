package com.oracle.cap14.autoavaliaca.exercicio5;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TestConcurrentMap {
	public static void main(String[] args) {
		ConcurrentMap<String, Integer> ages = new ConcurrentHashMap<String, Integer>();
		ages.put("John", 23);
		
		ages.remove("John", 23);
	}
}
