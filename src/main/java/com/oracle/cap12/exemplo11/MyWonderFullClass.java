package com.oracle.cap12.exemplo11;

public class MyWonderFullClass {
	public void go() {
		Bar b = new Bar();
		
		b.doStuff(new Foo() {
			
			@Override
			public void foof() {
				System.out.println("foofy");
			}
		});
	}
}
