package com.c1.Question3;

import java.util.concurrent.ConcurrentHashMap;

public class Account {
	int balance;
	int accountNo;
	
	public void displayBalance(int balance) {
		System.out.println("Balance is : "+balance);
	}
	public void deposit(int ammount) {
		int currentBalance=balance+ammount;
		displayBalance(currentBalance);
//		System.out.println(currentBalance);
	}
	public void withdraw(int ammount) {
		int current=balance-ammount;
		displayBalance(current);
//		System.out.println(current);
		
	}

}
