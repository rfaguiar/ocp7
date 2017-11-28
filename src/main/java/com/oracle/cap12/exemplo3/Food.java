package com.oracle.cap12.exemplo3;

public class Food {
	Popcorn p = new Popcorn(){
		
		public void sizzle() {
			System.out.println("anonymous sizzling popcorn");
		}
		
		public void pop() {
			System.out.println("anonymous popcorn");
		}
	};
	
	public void popIt() {
		p.pop();
//		p.sizzle();não compila
	}
}
