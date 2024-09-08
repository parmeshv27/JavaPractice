package com.general;

public class Test {
	
	public static void main(String[] args) {
		
		Color c1=Color.RED;
		System.out.println(c1);
		
		Week w1=Week.Monday;
		System.out.println(w1);
		
	}

}

enum Color{
	
	RED,
	BLACK,
	WHITE,
	YELLOW,
	BLUE
}


enum Week{
Monday,
Truesday,
Wednesday,
Thursday,
Friday,
Saturday,
Sunday
	
}