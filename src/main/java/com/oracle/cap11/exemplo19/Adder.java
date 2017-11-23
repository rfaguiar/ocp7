package com.oracle.cap11.exemplo19;

import java.util.Iterator;
import java.util.List;

public class Adder {
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
