package com.practice;

public class EvenNumber {
	
	public static void evenNum(int num){
		
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				System.out.print(" " + i);
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		evenNum(100);
	}

}
