package com.general;

public class RevNum {
	
	public static void main(String[] args) {
		
		int num=123456;
		
		int rev=0;
		while(num>0) {
			int v1=num%10;
			rev=rev*10+v1;
			num=num/10;
			
		}
		
		System.out.println("Reverse number is: "+ rev);
	}

}
