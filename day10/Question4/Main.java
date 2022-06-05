package com.day10.Question4;

public class Main {
	
	
    public static void main(String[] args) {
    	Shape shape=new Area();
		int areaOfRectangle= shape.rectangleArea(5, 6);
		int areaOfCircle= shape.circleArea(5);
		int areaOfSquare= shape.squareArea(6);
		System.out.println("Area of Rectangle :"+areaOfRectangle);
		System.out.println("Area of circle :"+areaOfCircle);
		System.out.println("Area of Square :"+areaOfSquare);
	}
}
