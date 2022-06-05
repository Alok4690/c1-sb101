package com.day10.Question1;

import java.util.Scanner;

public class Demo {
	public Hotel ProvideFoood(int amount) {
		if(amount>1000) {
			return new TajHotel();
		}
		else if(amount>200 && amount<=1000) {
			return new RoadSideHotel();
		}
		else {
			return null;
		}
	}
	public static void main(String[] args) {
		Demo d1=new Demo();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Ammount");
		int amount1= sc.nextInt();
		Hotel hotel=d1.ProvideFoood(amount1);
		if(hotel!=null) {
			hotel.chickenBiryani();
			hotel.masalaDosa();
		
		   if(hotel instanceof TajHotel) {
			TajHotel taj=(TajHotel)hotel;
			taj.welcomDrink();
		   }
		}
		else {
			System.out.println("Please Enter a Valid amount");
		}
	}

}
