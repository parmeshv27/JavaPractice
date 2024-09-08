package com.general;

public class ReverseString {
	
	
	public static String reverse="";
	public static void revString(String value){
		
		
		for(int i=value.length()-1; i>=0; i--) {
		char a=value.charAt(i);
		reverse=reverse+a;
		}
		System.out.println(reverse);
	}
	
	public static void main(String[] args) {
	revString("I am parmesh nagur bidar");
	}

}
