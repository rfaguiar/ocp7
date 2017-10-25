package com.oracle.cap14.autoavaliaca.exercicio2;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyArray {
	public static void main(String[] args) {
				
		CopyOnWriteArrayList<Integer> cowList = new CopyOnWriteArrayList<Integer>();
		cowList.add(4);
		cowList.add(2);
		cowList.add(6);
		Iterator<Integer> it = cowList.iterator();
		cowList.remove(2);
		while (it.hasNext()) {
			System.out.println(it.next() + " ");
			
		}
	}
}
