package com.practice;

public class PrimeSeries {
	
	public static void prime(int num) {
		for(int i=2; i<num; i++) {
			int count=0; 		
			for(int j=2; j<i; j++) {
				if(i%j==0) {
//					System.out.println("Num is not prime: " + i);
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.print(" "+ i);
			}
		}
	}
	
	public static void main(String[] args) {
		prime(100);
	}

}
