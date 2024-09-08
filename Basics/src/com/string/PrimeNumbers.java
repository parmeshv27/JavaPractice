package com.string;

public class PrimeNumbers {
	
	
	public static void checkPrime(int num){
		
		int flag=0;
		int m=num/2;
		
		if(num==0||num==1) {
			System.out.println("Number is not prime :" + num);
		}else {
			for(int i=2 ; i<=m; i++) {
				if(num%i==0) {
					System.out.println("Number is  not prime :" + num);
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("Number is  prime :" + num);
			}
		
		}
		
	}
	
	public static void main(String[] args) {
		checkPrime(97);
	}

}
