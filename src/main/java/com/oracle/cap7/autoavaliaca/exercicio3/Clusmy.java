package com.oracle.cap7.autoavaliaca.exercicio3;

public class Clusmy {
	public static void main(String[] args) {
		int j = 7;
		assert(++j > 7);
		assert(++j > 8): "hi";
		assert(j>10): j=12;
//		assert(j==12): doStuff(); //nãpo compila
		assert(j==12): new Clusmy();
		
	}

	private static void doStuff() {
	}
}
