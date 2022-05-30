package com.assignment.Question2;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of student");
		int num= sc.nextInt();
		Student[] students=new Student[num];
		for(int i=0;i<students.length;i++) {
			System.out.println("Enter roll");
			int roll= sc.nextInt();
			
			System.out.println("Enter name");
			String name=sc.next();
			
			System.out.println("Enter address");
			String address=sc.next();
			
			System.out.println("Enter marks");
			int marks= sc.nextInt();
			
			students[i]=new Student(roll,name,address,marks);
		}
		System.out.println("=================");
		for(Student student:students) {
			System.out.println("Roll is :"+student.getRoll());
			System.out.println("Name is :"+student.getName());
			System.out.println("Address is :"+student.getAddress());
			System.out.println("Marks is :"+student.getMarks());
			System.out.println("******************");
		}
		
		
	}

}
