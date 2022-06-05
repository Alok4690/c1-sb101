package com.day10.Question2;

public class ScienceStudent extends Student{

	public ScienceStudent(String name, String address) {
		super(name, address);
		System.out.println("Name is :"+name);
		System.out.println("Address is :"+address);

	}
	
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	@Override
	public void getPercentage() {
		int res=(physicsMarks+chemistryMarks+mathsMarks)*100;
		int percentage= (res/300);
		System.out.println("Percentage is :"+percentage+"%");
		
	}

}
