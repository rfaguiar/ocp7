package com.oracle.cap12.exemplo9;

public class Food {
	Popcorn p = new Popcorn(){
		public void sizzle() {
			System.out.println("anonymous sizzling popcorn");
		}
		
		public void pop() {
			System.out.println("anonymous popcorn");
		};
	};
	
	public void popIt() {
		p.pop();
//		p.sizzle();não compila a class pop não tem este metodo
	}
	
	public static void main(String[] args) {
		Food f = new Food();
		f.p.pop();
		
		Popcorn p = new Food().p;
		p.pop();
		
		
	}
}
