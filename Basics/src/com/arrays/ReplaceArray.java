package com.arrays;

import java.util.ArrayList;

public class ReplaceArray {
	
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");
		System.out.println(list);		
		list.set(1, "ReplacedTest");
		System.out.println(list);
		
	}

}
