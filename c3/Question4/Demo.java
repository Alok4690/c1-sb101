package com.c3.Question4;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Demo {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Name");
		String name=sc.next();
		System.out.println("Enter Password");
		String password=sc.next();
		
		System.out.println("Enter Mobile Number");
		String mobileNum=sc.next();
		
		System.out.println("Enter Email");
		String email= sc.next();
		
		if((Pattern.matches("[a-zA-Z]",name))&&(Pattern.matches("[a-zA-Z0-9]",password))&&(Pattern.matches("[0-9]",mobileNum))) {
			Customer c1=new Customer();
			c1.setUsername(name);
			c1.setPassword(password);
			c1.setMobileNumber(mobileNum);
			
			c1.setEmail(email);
			System.out.println(c1.getUsername());
			System.out.println(c1.getPassword());
			System.out.println(c1.getMobileNumber());
			System.out.println(c1.getEmail());
			
		}
		else {
			System.out.println("Invalid Message");
		}
	}

}
