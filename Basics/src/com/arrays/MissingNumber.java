package com.arrays;

public class MissingNumber {
	
	public static void main(String[] args) {		
		int[] ar= {1,2,3,4,5,6,7,8,9,10,11,12,13,15,16};
		
		boolean flag=false;		
	int n1=1, n2;	
	for(int i=1; i<ar.length; i++) {
		n2=ar[i];
		
		if(n2!=n1+1) {
			flag=true;
			break;
		}
		n1=n2;
		
	}
	if(flag) {
		int mis=n1+1;
		System.out.println("Missing number is: "+ mis);
	}
	}

}
