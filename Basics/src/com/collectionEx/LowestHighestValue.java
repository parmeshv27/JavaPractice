package com.collectionEx;

import java.util.Collections;
import java.util.LinkedList;

public class LowestHighestValue {
	
	
	public static  void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(20);
		list.add(40);
		list.add(90);
		list.add(30);
		System.out.println("List values are:" + list);
		Collections.sort(list);
		System.out.println("List values after sort :" + list);
		
//		Max value
		System.out.println("Highest Value is: "+ list.get(list.size()-1));
		
		//Min Value
		System.out.println("Lowest Value is: "+ list.get(0));
	}

}
