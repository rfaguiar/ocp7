package com.oracle.cap11.exemplo36;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestBackedCollections {
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();
		map.put("a", "ant");
		map.put("d", "dog");
		map.put("h", "horse");
		
		SortedMap<String, String> submap = map.subMap("b", "g");
		System.out.println(map + " " + submap);
		
		map.put("b", "bat");
		submap.put("f", "fish");
		
		map.put("r", "raccoon");
//		submap.put("p", "pig");
		System.out.println(map + " " + submap);
		
		
	}
}
