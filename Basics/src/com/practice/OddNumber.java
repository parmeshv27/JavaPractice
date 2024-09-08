package com.practice;

public class OddNumber {
	
	public static void oddNum(int num){
		for(int i=1; i<=num; i++) {
			if(i%2!=0) {
				System.out.print(" " + i);
			}
		}
	}
	
	public static void main(String[] args) {
		oddNum(100);
	}

}
