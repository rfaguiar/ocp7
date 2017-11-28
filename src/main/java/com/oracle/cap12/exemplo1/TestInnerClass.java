package com.oracle.cap12.exemplo1;

public class TestInnerClass {

	public static void main(String[] args) {
		MyOuter mo = new MyOuter();
		MyOuter.MyInner inner = mo.new MyInner();
		inner.seeOuter();
	}
	
}
