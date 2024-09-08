package com.general;

public class ReverseString2 {
	
	public static void revString(String value){
		
		String[] str = value.split("\\s");		
		for(String st:str) {
			System.out.println(st);
		}
		
	}
	
	
	public static void main(String[] args) {
		revString("Param Nagur Bidar Bangalore");
	}

}
