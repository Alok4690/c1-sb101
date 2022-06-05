package com.day12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	public boolean validate(String name,String mobileNum,String addarcard) {
		if((Pattern.matches("[a-z]{3-8}", name))&&(Pattern.matches("[0-9]{12}", addarcard))&& Pattern.matches("[0-9]",mobileNum)) {
			Citizen citizen=new Citizen();
			citizen.setName(name);
			citizen.setMobileNumber(mobileNum);
			citizen.setAadharNumber(addarcard);
			System.out.println(citizen.getName());
			System.out.println(citizen.getMobileNumber());
			System.out.println(citizen.getAadharNumber());
			return true;
		}
		else {
			System.out.println("Error message");
			return false;
		}
		
	}
	public static void main(String[] args) {
		Demo d1= new Demo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.next();
		
		System.out.println("Enter Mobile Number");
		String mobileNum=sc.next();
		
		System.out.println("Enter AdharCard");
		String aadharCard=sc.next();
		d1.validate(name, mobileNum, aadharCard);
	}

}
