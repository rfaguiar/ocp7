package com.oracle.cap12.exemplo5;

public class MyWonderFullClass {
	public void go() {
		Bar b = new Bar();
		b.doStuff(new Foo() {			
			public void foof() {
				System.out.println("foofy");
			}
		});
	}
	
	public static void main(String[] args) {
		new MyWonderFullClass().go();
	}
}
