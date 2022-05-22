package com.day4.StudentDetails2;

import com.day4.StudentDetailsDisplay.StudentDetails;

public class DisplayData {
	public static void main(String[] args) {
		
		
		
		
		//using parameterized constructor
		StudentDetails2 student1 = new StudentDetails2(101, "Ramesh","Delhi","NIT");
		
		
		System.out.println("Student2 details using getter methods");
		System.out.println("Roll is :"+student1.getRoll());
		System.out.println("Name is :"+student1.getName());
		System.out.println("Address is :"+student1.getAddress());
		System.out.println("College Name is :"+student1.getColl());
	}

}
