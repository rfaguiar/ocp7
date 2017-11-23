package com.oracle.cap11.exemplo22;

import java.util.ArrayList;
import java.util.List;

import com.oracle.cap11.exemplo21.Dog;

public class TestWildcards {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		Bar bar = new Bar();
//		bar.doInsert(myList);
	}
}

class Bar {
	public void doInsert(List<Object> list) {
		list.add(new Dog());
	}
}
