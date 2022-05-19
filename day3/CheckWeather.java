package com.day3;

public class CheckWeather {
	public static void main(String[] args) {
		boolean isSnowing= false;
		boolean isRaining= true;
		double temperture= 60.0;
		
		if(isSnowing==true || isRaining==true || temperture<50.0) {
			System.out.println("Let’s stay home.");
		}
		else {
			System.out.println("Let’s go out!");
		}
	}

}
