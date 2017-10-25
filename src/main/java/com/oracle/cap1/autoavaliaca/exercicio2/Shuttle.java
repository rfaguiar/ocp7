package com.oracle.cap1.autoavaliaca.exercicio2;

public class Shuttle extends Rocket {

	public static void main(String[] args) {
		new Shuttle().go();
	}
	
	void go() {
		bastOff();
//		Rocket.blastOff();
	}
	
	private void bastOff() {
		System.out.println("sh-bang");
	}
}
