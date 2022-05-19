package com.day3;

public class VowelConsonent {
	
	void CheckAlphabate(char alphabat) {
		
		if(alphabat=='a' || alphabat=='e' || alphabat=='i' || alphabat=='o' || alphabat=='u') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonent");
		}
	}
	public static void main(String[] args) {
		VowelConsonent v1= new VowelConsonent();
		v1.CheckAlphabate( 'b');
	}

}
