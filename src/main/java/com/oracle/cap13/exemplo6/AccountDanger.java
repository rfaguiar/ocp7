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
			makeWithdrawl(10);
			if (this.acct.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			}
		}
	}

	private synchronized void makeWithdrawl(int amt) {
		if (this.acct.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to witdraw");
			try { Thread.currentThread().sleep(500); } catch (InterruptedException e) {}
			this.acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + " completes the withdraw");
		} else {
			System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + this.acct.getBalance());
		}
	}

}
