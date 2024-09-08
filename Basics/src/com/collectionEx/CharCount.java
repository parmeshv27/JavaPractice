package com.collectionEx;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharCount {
	
	
	
	public static void countCharacters(String value) {
		
	HashMap<Character, Integer>	chacterCount=new HashMap<Character, Integer>();
	
	char[] chars = value.toCharArray();
	for(char c:chars) {
		if(chacterCount.containsKey(c)) {
			
			chacterCount.put(c, chacterCount.get(c)+1);
		}
		else {
			chacterCount.put(c, 1);
		}
	}
	
	for(Entry<Character, Integer> entry:chacterCount.entrySet()) {
		System.out.println(entry.getKey() + " " + entry.getValue());
	}
		
	}
	

	public static void main(String[] args) {
		
		countCharacters("AHJFHJHDSFHhfffFSLHFDSHk");
	}
}
