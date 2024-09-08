package com.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CompareArray {
	
	public static void main(String[] args) {
		
		int[] ar1= {2,3,5,7,9};
		int[] ar2= {9,3,7,5,2};
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		boolean flag=false;
		
		if(ar1.length!=ar2.length) {
			flag=true;
		}else {
			for(int i=0; i<ar1.length; i++) {
				if(ar1[i]!=ar2[i]) {
					flag=true;
					break;
				}
			}
		}
		
		if(!flag) {
			System.out.println(" Both array are matched");
		}else {
			System.out.println(" Both array are not matched");
		}
		
	}

}
