package com.general;

public class FibonacciNumber {
	public static void main(String[] args) {
		
		int fiblength=30;
		int[] num = new int[30];
		num[0]=0;
		num[1]=1;
		
		for(int i=2; i<fiblength; i++) {
			num[i]=num[i-1]+num[i-2];
		}
		
		for(int i=0; i<fiblength; i++) {
			System.out.print(num[i] + " ") ;
		}
	}

}
