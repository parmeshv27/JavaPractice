package com.string;

public class PrimeNumber {
	
	public static void prime(int num) {
		
	int	count=0;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				System.out.println("Number is not a prime : " + num);
				count++;
			}
		}
		if(count==0) {
			System.out.println("Number is prime: " + num);
		}
	}
	
	public static void main(String[] args) {
		prime(9);
	}

}
