package com.oracle.cap14.autoavaliaca.exercicio7;

import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomicInteger {
	public static void main(String[] args) {
		AtomicInteger i = new AtomicInteger();
		i.addAndGet(9);
		i.addAndGet(9);
	}
}
