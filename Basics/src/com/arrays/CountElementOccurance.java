package com.arrays;

import java.util.Arrays;

public class CountElementOccurance {
	
	public static void main(String[] args) {
		
		int ar[]= {1,2,1,1,2,3,1,4,5,2,8,9,8,10,15};	
		Arrays.sort(ar);
		for(int i=0; i<ar.length; i++) {
			int count=1;
			for (int j=i+1; j<ar.length; j++) {
				if(ar[i]==ar[j]) 
					count++;
				else 
					break;
				
			}
			System.out.println(" Element and it's count is " + ar[i] + " : " + count);
			
			i +=count-1;
		}
		
	}

}
