package com.oracle.cap1.autoavaliaca.exercicio4;

public enum Animals {
	DOG("woof"), CAT("meow"), FISH("burble");
	
	String sound;

	private Animals(String s) {
		this.sound = s;		
	}
}
