package com.day10.Question2;

public class HistoryStudent extends Student {

	public HistoryStudent(String name, String address) {
		super(name, address);
		System.out.println("Name is :"+name);
		System.out.println("Address is :"+address);
	}
	int historyMarks;
	int civicsMarks;

	@Override
	public void getPercentage() {
		int res= (historyMarks+civicsMarks)*100;
		int percentage=res/200;
		System.out.println("Percentage is :"+percentage+"%");
		
	}

}
