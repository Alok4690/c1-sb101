package com.c1.Question3;

public class Deposit extends Thread{
	int ammount;
	Account account;
	public Deposit( Account account,int ammount) {
		this.account = account;
		this.ammount = ammount;
		
	}
	
	@Override
	public void run() {
		account.deposit(ammount);
		account.withdraw(ammount);
		
	}
	
	

}
