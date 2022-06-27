package com.c1.Question2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.print.event.PrintJobEvent;

public class Main {
	public static void main(String[] args) throws IOException, IOException {
		Employee em=new Employee(11, "Alok", new Address("U.P", "Gzb", 1100000), "singh@gmail", "123456");
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("emp.txt"));
			
		oos.writeObject(em);
		oos.close();
		System.out.println("done");
	}

}
