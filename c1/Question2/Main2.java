package com.c1.Question2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main2 {
	public static void main(String[] args) throws IOException, Exception {
		FileInputStream fis= new FileInputStream("emp.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Employee em=(Employee)ois.readObject();
		System.out.println(em);
	}

}
