package com.practice;

public class Fibonacci {
	
	public static void fib(int num) {
		
		int n1=0, n2=1, n3=0;
		System.out.print(" "+0+" "+1);
		
		for(int i=1; i<num; i++) {
			if(n3<num) {
				n3=n1+n2;
				n1=n2;
				n2=n3;
				System.out.print(" " + n3);
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		fib(100);
	}

}
