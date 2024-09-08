package com.string;

public class StringMethods {
	
	public static void main(String[] args) {
		
		//substring
		String str="Parameshwar";		
		String s2 = str.substring(3);
		System.out.println(s2);
		String s3=str.substring(2, 6);
		System.out.println(s3);
		
		//contains
		String s4="Vankdale";
		boolean s5 = str.contains(s4);
		System.out.println(s5);
		
		//concat
		String s6 = s2.concat(s4);
		System.out.println(s6);
		
		
		//split
		System.out.println("Split -----------------");
		String sp="Param Vankdale Nagaur";
	String[]	st=sp.split(" ");
	for( String sr:st) {
		System.out.println(sr);
	}
	System.out.println("Split -----------------");
		
	}

}
