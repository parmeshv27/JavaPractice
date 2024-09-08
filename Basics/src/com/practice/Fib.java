package com.practice;

public class Fib {
	
	public static void main(String[] args) {
		
		int num=100;
		int n1=0, n2=1, n3 = 0;
		
		System.out.print("Fib numbers are: " + " " + 0 + " "+ 1 +" ");
		for(int i=0; i<num; i++) {		
			if(n3<100) {
				n3=n1+n2;
				n1=n2;
				n2=n3;
				if(n3<100) {
					System.out.print(n3 + " ");
				}
			}
			
			
			}
		}
	}


