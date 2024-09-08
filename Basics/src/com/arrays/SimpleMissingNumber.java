package com.arrays;

public class SimpleMissingNumber {
	
	public static void main(String[] args) {
		
		int[] ar= {1,2,3,4,5,6,7,9,10,11};
		int n1, n2, n3;
		boolean flag;
		for(int i=0; i<ar.length; i++) {
			
			 n1=ar[i];
			 n2=ar[i+1];
			 n3=ar[i+2];
			 flag=false;
			 if(n3!=n2+1) {
				 flag=true;
				 System.out.println(n2+1);
				 break;
			 }
		}
			
		}
	}

