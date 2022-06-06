package com.c3.Question1;

import java.lang.invoke.VarHandle;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		try {
		    Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the number of element in the array");
		   int size=sc.nextInt();
		   Array[] array=new Array[size];
		    for(int i=0;i<array.length;i++) {
			System.out.println("Enter the elements in the array");
			int element= sc.nextInt();
			array[i]=new Array();
		   }
		
		
		
		System.out.println("Enter thr index of the array element you want to access");
		int index=sc.nextInt();
		System.out.println(array[index]);
		System.out.println("The array element successfully accessed ");
	}
		catch (Exception ae) {
			System.out.println("Invalid");
		}
		
	}

}
