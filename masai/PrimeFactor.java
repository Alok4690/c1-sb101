package com.masai;

public class PrimeFactor {
	public static void main(String[] args) {
		
		int N= 12;
		for(int i=1;i<=N;i++) {
			if(N%i==0) {
				int sol= i;
				System.out.println(sol);
			}
			
			
		}
	}

}
