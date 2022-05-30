package com.assignment.Question4;

public class Main {
	public static Person generatePerson(Person person) {
		Person p1= new Student();
		
		return p1;
	}
	
	
	
	public static void main(String[] args) {
		Person newStudent = generatePerson(new Student());
		Student s1=(Student)newStudent;
		s1.setStudentId(1);
		s1.setCourseEnrolled("JA111");
		s1.setCourseFee(30000);
		newStudent.setAddress(new Address());
		newStudent.getAddress().setCity("chennai");
		newStudent.getAddress().setPincode("60001");
		newStudent.getAddress().setState("TN");
		Person newTeacher = new Instructor();
		Instructor I1=(Instructor)newTeacher;
		I1.setInstructorid(456);
		I1.setSalary(45612);

		System.out.println("studentId is :"+s1.getStudentId());
		System.out.println("Course Fee is :"+s1.getCourseFee());
		System.out.println("course Enrolled is :"+s1.getCourseEnrolled());
		System.out.println("Address-----------");
		System.out.println("City is :"+s1.getAddress().getCity());
		System.out.println("State is :"+s1.getAddress().getState());
		System.out.println("Pincode is :"+s1.getAddress().getPincode());
		System.out.println("****************************");
		
		System.out.println("Instructor id is :"+I1.getInstructorid());
		System.out.println("Salary is :"+I1.getSalary());
		System.out.println("Address-----------");
		System.out.println("City is :"+s1.getAddress().getCity());
		System.out.println("State is :"+s1.getAddress().getState());
		System.out.println("Pincode is :"+s1.getAddress().getPincode());
//		
	}

}
