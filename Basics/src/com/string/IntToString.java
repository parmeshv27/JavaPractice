package com.string;

public class IntToString {
	
	public static void main(String[] args) {
		
//Scenario 1		
		
		int a=10;
		String sp=String.valueOf(a);
		System.out.println(sp+20);
		
//Scenario 2
		
		int b=20;
		
		String st=Integer.toString(b);
		
		System.out.println(st+40);
		
		// String to Integer
		
		String c="15";
		
		int cc=Integer.parseInt(c);	
		System.out.println(cc+10);
		
		
		
	}

}
