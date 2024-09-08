package com.general;

public class ReverseNumber {
	
	public static void numberReverse(int num) {
		
		while(num>0) {
			int a=num%10;
			num=num/10;
			System.out.print(a);
			
		}
	}
	
	public static void main(String[] args) {
		numberReverse(1208934);
	}

}
