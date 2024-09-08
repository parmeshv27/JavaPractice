package com.collectionEx;

import java.util.HashMap;
import java.util.Map.Entry;

public class OccuranceOfCharacter {
	
	
	public static void characterCount(String inputString){
		
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
	char[]	value=inputString.toCharArray();
	for(char c:value) {
		
		if(charCountMap.containsKey(c)) {
			charCountMap.put(c, charCountMap.get(c)+1);
		}
		else {
			charCountMap.put(c, 1);
		}
	}
	
	// printing the char count from the map
	
	for(Entry<Character, Integer> entry:charCountMap.entrySet()) {
		System.out.println(entry.getKey() +"=" + entry.getValue() );
	}
	
	}
	
	public static void main(String[] args) {
		
		characterCount("amareshwar");
	}

}
