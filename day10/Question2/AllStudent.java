package com.day10.Question2;

import java.util.Scanner;

public class AllStudent {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=sc.nextLine();
		System.out.println("Enter Address");
		String address=sc.next();
		System.out.println("Enter Physics Marks");
		int physics= sc.nextInt();
		System.out.println("Enter chemistry Marks");
		int chemistry=sc.nextInt();
		System.out.println("Enter maths maths");
		int maths=sc.nextInt();
		
		Student s1= new ScienceStudent(name, address);
		
		ScienceStudent science=(ScienceStudent)s1;
		
		science.physicsMarks=physics;
		science.chemistryMarks=chemistry;
		science.mathsMarks=maths;
		s1.getPercentage();
		
		sc.nextLine();
		System.out.println("Enter Your Name");
		String name1=sc.nextLine();
		System.out.println("Enter Address");
		String address1=sc.next();
		System.out.println("Enter History Marks");
		int History= sc.nextInt();
		System.out.println("Enter civics Marks");
		int civics=sc.nextInt();
		
		Student s2=new HistoryStudent(name1,address1);
		HistoryStudent history=(HistoryStudent)s2;
		history.historyMarks=History;
		history.civicsMarks=civics;
		s2.getPercentage();
		
	}

}
