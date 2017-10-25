package com.oracle.cap2.autoavaliaca.exercicio8;

public class DogShow {
	public static void main(String[] args) {
		new DogShow().go();
	}
	
	void go() {
		((Dog) new Hound()).bark();
//		((Dog) new Hound()).sniff();
	}
}
