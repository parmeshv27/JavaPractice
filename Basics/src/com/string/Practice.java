package com.string;

public class Practice {
	
	public static void main(String[] args) {		
		String str1="Java t point Bangalore";		
		String[] s=str1.split("//s");
		for(String st:s) {			
			StringBuffer sf=new StringBuffer(st);
			StringBuffer sk = sf.reverse();			
			System.out.println(sk);
		}
		
		String str2="Java t point Bangalore";
		String rev="";
		for(int i=str2.length()-1; i>=0; i--) {
		char	c=str2.charAt(i);
		rev=rev+c;
		}
		
		System.out.println(rev);
	}
}
