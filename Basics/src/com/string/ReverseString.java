package com.string;

public class ReverseString {
	
	
	public static void reverse(String str){
		
	String	temp="";
		
		
		for(int i=str.length()-1; i>=0; i--) {
			
		char	v=str.charAt(i);
		
		temp=temp+v;
		}
		
		System.out.println("Reverse string is : " + temp);
			
	}
	
	public static void main(String[] args) {
		reverse("Param");
		
	}

}
