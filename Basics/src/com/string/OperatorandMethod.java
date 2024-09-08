package com.string;

public class OperatorandMethod {
	public static void main(String[] args) {
		
		// == - it compare the object
		// equalsTo() it compare the value
		
		String a1="Param";
		String a2="Param";
		String a3=new String("Param");
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		System.out.println(a2==a3);
	
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a2.equals(a3));
		
		
	 
		
		
	}

}
