package com.string;

public class Practice {
	
	public static void main(String[] args) {		
		String str="Java t point Bangalore";		
		String[] s=str.split("//s");
		for(String st:s) {			
			StringBuffer sf=new StringBuffer(st);
			StringBuffer sk = sf.reverse();			
			System.out.println(sk);
		}
	}
}
