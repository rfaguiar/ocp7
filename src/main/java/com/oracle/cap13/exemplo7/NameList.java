package com.oracle.cap13.exemplo7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NameList {
	private List<String> names = Collections.synchronizedList(new LinkedList<String>());
	
	public synchronized void add(String nome) {
		names.add(nome);
	}
	
	public synchronized String removeFirst() {
		if (names.size() > 0) {
			return names.remove(0);
		} else {
			return null;
		}
	}
}
