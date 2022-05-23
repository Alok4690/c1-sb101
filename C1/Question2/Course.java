package com.masai.Question2;

import java.util.Scanner;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	public void displayCourseDetails(int courseId,String courseName,int courseFee) {
		System.out.println("Course Id is :"+ courseId);
		System.out.println("Course Name is :"+courseName);
		System.out.println("Course Fee is :"+courseFee);
		
	}
	static public void authenticate(String username,String password) {
		
		
		if(username=="Admin" && password=="1234") {
			Course c1= new Course();
			Scanner inputScanner=new Scanner(System.in);
			System.out.println("Enter Course Id");
			int courseId=inputScanner.nextInt();
			System.out.println("Enter Course Name");
			String courseName=inputScanner.next();
			System.out.println("Enter Course Fee");
			int courseFee=inputScanner.nextInt();
			c1.displayCourseDetails(courseId, courseName, courseFee);
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}
	public static void main(String[] args) {
//		checking correct username and password
	authenticate("Admin", "1234");
	
//	checking wrong username and password
		authenticate("Amit", "12345");
	}

}
