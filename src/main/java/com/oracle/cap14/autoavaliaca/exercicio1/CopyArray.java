package com.oracle.cap14.autoavaliaca.exercicio1;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyArray {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<Integer>();
		cowList.add(4);
		cowList.add(2);
		Iterator<Integer> it = cowList.iterator();
		cowList.add(6);
		while (it.hasNext()) {
			System.out.println(it.next() + " ");
			
		}
	}
}
