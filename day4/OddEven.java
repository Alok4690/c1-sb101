package com.day4;

import javax.imageio.metadata.IIOMetadataFormat;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class OddEven {
	int input;
	void checkOddEven(int input) {
		if(input%2==0) {
			int res= input+6;
			System.out.println("Output :" + res );
		}
		else if (input%2==1) {
			System.out.println(input);
		}
	}
	public static void main(String[] args) {
		OddEven e1= new OddEven();
		
		e1.checkOddEven(45);
	}

}
