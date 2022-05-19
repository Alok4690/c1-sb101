package com.day3;

import org.xml.sax.ext.Attributes2;

public class StudentDetails {
	int roll;
	String name;
	int marks;
	void student1Detail() {
    System.out.println("Roll is 12456789");		
    System.out.println("Name is Alok Singh");
    System.out.println("Marks is 90");
		
	}
	void student2Detail() {
		System.out.println("Roll is 23645987");		
	    System.out.println("Name is Amit Singh");
	    System.out.println("Marks is 50");
		
	}
	public static void main(String[] args) {
		StudentDetails s1= new StudentDetails();
		s1.student1Detail();
		StudentDetails s2 =new StudentDetails();
		
		s2=null;
		s2.student2Detail();
	}

}
