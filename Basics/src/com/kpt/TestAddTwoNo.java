package com.kpt;

public class TestAddTwoNo {
	public static void main(String[] args) {
		
		AddTwoNo	ref=new AddTwoNo();		
	int	s1=ref.add(15, 250);
	int	s2=ref.add(25, 250);
	int	s3=ref.add(35, 250);
	int	s4=ref.add(45, 250);
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	
	
	int s5=ref.add(10, 20, 30);
	
	}

}
