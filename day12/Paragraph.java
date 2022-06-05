package com.day12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paragraph {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Paragraph---");
//		sc.nextLine();
		String paragraph= sc.nextLine();
		int count=0;
		Pattern p= Pattern.compile("Java");
		Matcher m=p.matcher(paragraph);
		while(m.find()) {
			count++;
			System.out.println(m.start() +"---"+m.end()+"---"+m.group());
		}
		System.out.println("Number of occurence :"+count);
	}

}
