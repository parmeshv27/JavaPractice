package com.arrays;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		int[] ar= {2,4,50,3,56,87,34,53,10};
		
		int temp;
		
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		
		for(int k=0; k<ar.length; k++) {
			System.out.print(ar[k] + ",");
		}
		int l=ar.length;
		System.out.println();
		System.out.println(" 1 st Largest nu is:" + ar[l-1]);
		System.out.println(" 2nd Largest nu is:" + ar[l-2]);
		
	}

}
