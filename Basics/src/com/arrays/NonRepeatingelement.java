package com.arrays;

public class NonRepeatingelement {
	static void findNonRepeatingElement(int nums[]) {
	    boolean chk;
	    for(int i=0;i<nums.length;i++) {
	        chk = false;
	        for(int j=0;j<nums.length;j++) {
	            if(i != j && nums[i] == nums[j]) {
	                chk = true;
	                break;
	            }
	        }
	        if(!chk) System.out.print(nums[i]+" ");
	    }
	}
	public static void main(String[] args) {
		int nums[] = {1,2,3,4,2,3,5,6,7,1};
		System.out.println("Non-repeating numbers are: ");
		findNonRepeatingElement(nums);
	}
}
