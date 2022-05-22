package com.day4.StudentDetailsDisplay;

public class StudentDetails {
	private int roll;
	private String name;
	private int age;	
	private int marks;
	
//	zero argument constructor
	public StudentDetails() {
		
	}
	
//	parametrized constructor
	public StudentDetails(int roll,String name, int age, int marks) {
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	public void setRoll(int roll) {
		this.roll=roll;
	}
	public int getRoll() {
		return roll;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public int getMarks() {
		return marks;
	}
	
	public void showDetails() {
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Age is :"+ age);
		System.out.println("Marks is :"+marks);
	}

}
