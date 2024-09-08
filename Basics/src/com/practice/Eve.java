package com.practice;

public class Eve {
	
	public static void main(String[] args) {
		
		findEvenNumber(14);
		findEvenNumber(15);
		
	}
	
	public static void findEvenNumber(int num){

		if(num%2==0) {
			System.out.println("No is even" + num);
		}else {
			System.out.println("No is odd" + num);
		}
	}

}
