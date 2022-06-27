package com.c1.Question3;

public class Withdraw extends Thread{
	int ammount;
	Account account;
	public Withdraw( Account account,int ammount) {
		this.account = account;
		this.ammount = ammount;
		
	}
	
	@Override
	public void run() {
		account.deposit(ammount);
		account.withdraw(ammount);
		
	}
	
	

}
