package com.oracle.cap2.autoavaliaca.exercicio9;

public class Redwood extends Three {
	public static void main(String[] args) {
		new Redwood().go();
	}

	void go() {
		go2(new Three(), new Redwood());
		go2((Redwood) new Three(), new Redwood());
	}

	void go2(Three t1, Redwood r1) {
		Redwood r2 = (Redwood) t1;
		Three t2 = (Three) r1;
	}
}
