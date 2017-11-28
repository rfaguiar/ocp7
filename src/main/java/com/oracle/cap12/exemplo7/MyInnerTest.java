package com.oracle.cap12.exemplo7;

public class MyInnerTest {
	public static void main(String[] args) {
		MyOuter mo = new MyOuter();
		MyOuter.MyInner inner = mo.new MyInner();
		inner.seeOuter();
		
	}
}
