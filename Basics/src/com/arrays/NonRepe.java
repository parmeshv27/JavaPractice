package com.arrays;

public class NonRepe {
	
	public static void main(String[] args) {
	
		
		int ar[]= {8,3,4,1,2,3,5,6,7,10,8};
		
		
		for(int i=0; i<ar.length; i++) {
			boolean flag=false;
			for(int j=0; j<ar.length; j++) {
				if(i!=j && ar[i]==ar[j]) {
					flag=true;
					break;
				}
			}
			
			if(flag==false) {
				System.out.print(ar[i] + " ");
			}
			
		}
		
	}

}
