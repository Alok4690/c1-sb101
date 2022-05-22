package com.day4;

public class Demo {
	String name;
	int age;
	public void Demo() {
	   name="Alok";
	   age=19;
	}
	public void Demo(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public void showDisplay() {
		System.out.println("My Name is :"+ name);
		System.out.println("My Age is :"+ age);
	}
	public static void main(String[] args) {
		Demo name1= new Demo();
		name1.showDisplay();
		
		Demo name2= new Demo("alok",19);
		name2.showDisplay();
	}

}
