package com.oracle.cap1.autoavaliaca.exercicio10;


public class Tablet extends Eletronic implements Gadget {

	@Override
	public void doStuff() {
		System.out.println("show book");
	}
	
	public static void main(String[] args) {
		new Tablet().getPower();
		new Tablet().doStuff();
	}

}
