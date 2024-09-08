package com.exceptions;

public class TestExceptions {
	
	public static void m1(int b, int c){
		
try {

	int a;	
	a=b/c;
	System.out.println(a);
	
}catch(ArithmeticException e) {
	e.printStackTrace();
}

catch(Exception e) {
	e.printStackTrace();
}
		
	}
	
	public static void main(String[] args) {
		
		m1(2, 0);
	}

}
