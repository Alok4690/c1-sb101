package com.day4.StudentDetails2;

public class StudentDetails2 {
	private int roll;
	private String name;
	private String address;	
	private String collageName;
	

	
	
//	parametrized constructor
	public StudentDetails2(int roll,String name, String address, String colllegeName) {
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName=collageName;
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
	
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setColl(String collageName) {
		this.collageName=collageName;
	}
	public String getColl() {
		return collageName;
	}
	
	

}
