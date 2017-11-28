package com.oracle.cap12.exemplo1;

public class TestInnerClass2 {

	public static void main(String[] args) {
		MyOuter.MyInner in = new MyOuter().new MyInner();
		in.seeOuter();
	}
	
}
