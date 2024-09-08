package com.string;

public class Palindrome {
	
	
	
public static void main(String[] args) {
	
	int[] arr= {1221, 12, 232, 151, 1678};
	
	for(int i=0; i<arr.length; i++) {
		int rev=0;
		int num=arr[i];		
		while(num>=1) {			
			int reminder=num%10;
			num=num/10;			
			rev=rev*10+reminder;
		}
	System.out.println(rev);

		if(rev==arr[i]) {
			System.out.println("Number is Palindrome: " + rev);
		}
		else {
			System.out.println("Number is not Palindrom : " + num);
		}
	}	
	
}	
	
	}
