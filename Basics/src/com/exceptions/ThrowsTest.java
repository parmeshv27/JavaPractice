package com.exceptions;

public class ThrowsTest {
	
	public static void divide(int a , int b) throws ArithmeticException{
		int c=a/b;
		System.out.println(c);	
		
	}
	
	public static void main(String[] args) {
		divide(1, 0);
		System.out.println("Hello");
	}

}
