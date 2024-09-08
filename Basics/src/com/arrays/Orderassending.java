package com.arrays;

public class Orderassending {

	public static void main(String[] args) {

		int[] ar={ 5,2,8,7,1,0};
		System.out.println("Before assending no series is "  );
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]  );
		}

		int temp ;
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {

				if(ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}		
			}
		}
		System.out.println("After assending no series is "  );
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]  );

		}		

	}

}
