package com.oracle.cap13.exemplo6;

public class AccountDanger implements Runnable{

	private Account acct = new Account();
	
	public static void main(String[] args) {
		AccountDanger r = new AccountDanger();
		Thread one = new Thread(r, "Fred");
		Thread two = new Thread(r, "Lucy");
		one.start();
		two.start();
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			makeWithdrawal(10);
			if (acct.getBalane() < 0) {
				System.out.println("account is overdrawn!");
			}
			
		}
	}
	private synchronized void makeWithdrawal(int amt) {
		if (acct.getBalane() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to widraw");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		} else {
			System.out.println("Not enogh in account for " +Thread.currentThread().getName() + " to withdraw " + acct.getBalane());
		}
	}

}
