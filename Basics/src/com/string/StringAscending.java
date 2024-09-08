package com.string;

public class StringAscending {
	
	public static void main(String[] args) {
		
		String temp="";
		String[] str= {"Param", "Vankdale","ADA","Nagur"};
		
		for(int i=0; i<str.length-1; i++) {
			for(int j=i+1; j<str.length; j++) {
if(str[i].compareTo(str[j])>0) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
	}

}
