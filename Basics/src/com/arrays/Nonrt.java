package com.arrays;

public class Nonrt {
	
	public static void main(String[] args) {
		
		String stp="aabjjkblil";
		int totalchar=stp.length();
		boolean flag=false;
		for(int i=0; i<totalchar; i++) {
			flag=false;
			for(int j=0; j<totalchar; j++) {
				
			if(	i!=j && stp.charAt(i)==stp.charAt(j)) {
				flag=true;
				break;
			}
			}
			if(!flag) {
				System.out.println(stp.charAt(i));
			}
		}
	}

}
