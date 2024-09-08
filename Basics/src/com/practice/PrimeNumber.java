package com.practice;

public class PrimeNumber {
	
	public static void prime(int num) {
		int count=0; 		
		if(num==0 || num==1) {
			System.out.println("Num is not prime : "+ num);
		}
		else {
			for(int j=2; j<num; j++) {
				if(num%j==0) {
					System.out.println("Num is not prime: " + num);
					count++;
				}
			}
			if(count==0) {
				System.out.println("Num is prime: "+ num);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		prime(1);
	}

}
