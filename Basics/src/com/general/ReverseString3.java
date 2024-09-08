package com.general;

public class ReverseString3 {

	public static String reverseWord(String str) {
		String reverseWord="";
		String[] st=str.split("//s");
		for(String s:st) {
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			reverseWord=sb + " ";
			
		}

		return reverseWord;
}
	
	public static void main(String[] args) {
	String	stp=reverseWord("I am parmesh nagur bidar");
	System.out.println(stp);
	}
	
}
