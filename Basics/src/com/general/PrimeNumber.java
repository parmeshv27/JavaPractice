package com.general;

public class PrimeNumber {
	

	public static boolean isPrime(int num) {
		if(num<=1)
			return false;
		for(int i=2; i<num; i++) {
			if(num%i==0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		boolean status = isPrime(44);
		if(status==true) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
		
	}

}
