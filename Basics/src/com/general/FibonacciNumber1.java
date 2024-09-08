package com.general;

public class FibonacciNumber1 {
	
	public static void main(String[] args) {
		
		
		int[] ar=new int[13];
		ar[0]=0;
		ar[1]=1;
		
		for(int i=0; i<10; i++) {
			int j=i+1;
			int m=i+2;
			int n3=ar[i]+ar[j];
		
			ar[m]=n3;
		}
		System.out.println("Feb no are:");
	for(int j=0; j<10; j++) {
		
		System.out.print(" "+ar[j]);
	}
		
	}

}
