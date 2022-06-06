package com.c3.Question3;

public class Demo {
	public void showDetails(Month m) {
		try {
		switch(m){
		case JAN:
		System.out.println("This is the 1st Month of the Year January");
		break;
		case FEB:
		System.out.println("This is the 2nd Month of the Year February");
		break;
		case MAR:
		System.out.println("This is the 3nd Month of the Year March");
		break;
		case APR:
		System.out.println("This is the 4nd Month of the Year April");
		break;	
		default:
		System.out.println("other day");
		}
	}
		catch(Exception e){
			System.out.println("Invalid Month Name");
		}
 }
	public static void main(String[] args) {
//		Month m= Month.JAN;
//		System.out.println(m);
		Demo d1= new Demo();
		d1.showDetails(Month.JAN);
	}

}
