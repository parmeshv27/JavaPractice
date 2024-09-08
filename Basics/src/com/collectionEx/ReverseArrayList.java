package com.collectionEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Param");
		list.add("Ketaki");
		list.add("Meeta");
		System.out.println("Before reverse:" + list);
		
		Collections.reverse(list);
		System.out.println("After reverse:" + list);
		
		Collections.sort(list);
		System.out.println("After sort:" + list);
		
		
	}

}
