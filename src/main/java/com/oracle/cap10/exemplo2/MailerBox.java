package com.oracle.cap10.exemplo2;

public class MailerBox implements Box, Mailer {
	
	private Box box;
	
	public MailerBox(Box box) {
		this.box = box;
	}
	
	@Override
	public void addPostage() {
		System.out.println("affix stamps");
	}

	@Override
	public void ship() {
		System.out.println("put in mailbox");
	}

	@Override
	public void pack() {
		this.box.pack();
	}

	@Override
	public void seal() {
		this.box.seal();
	}

}
