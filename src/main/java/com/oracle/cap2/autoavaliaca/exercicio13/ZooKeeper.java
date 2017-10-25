package com.oracle.cap2.autoavaliaca.exercicio13;

public class ZooKeeper {
	public static void main(String[] args) {
		new ZooKeeper().go();
	}
	void go() {
		Mammal m = new Zebra();
		System.out.println(m.name + m.makeNoise());
	}
}
