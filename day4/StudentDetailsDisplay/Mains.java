package com.day4.StudentDetailsDisplay;

public class Mains {
	public static void main(String[] args) {
		//using zero argument constructor
		StudentDetails student1 = new StudentDetails();
		student1.setRoll(100);
		student1.setName("Ram");
		student1.setAge(19);
		student1.setMarks(800);
		
		
		
		//using parameterized constructor
		StudentDetails student2 = new StudentDetails(101, "Ramesh",20, 850);
		student1.showDetails();
		
		System.out.println("Student2 details using getter methods");
		System.out.println("Roll is :"+student2.getRoll());
		System.out.println("Name is :"+student2.getName());
		System.out.println("Age is :"+student2.getAge());
		System.out.println("Marks is :"+student2.getMarks());
	}

}
