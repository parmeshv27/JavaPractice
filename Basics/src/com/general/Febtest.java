package com.general;

public class Febtest {
	public static void main(String[] args) {
		
		String st="Param Vankdale Nagur";
		
	String[]	s=st.split("\\s");
	for(String s1:s) {
//		System.out.println(s1);
		
		String sm=reverseString(s1);
		System.out.print(sm +" ");
	}		
	}
	
	public static String reverseString(String st){
		String sr="";
		
		int l=st.length();
		for(int i=l-1; i>=0; i--) {
			char c=st.charAt(i);
			sr=sr+c;
		}
		
		
		return sr;
	}

}
