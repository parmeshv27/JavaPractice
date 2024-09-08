package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacter {
	
	public static void findDuplicate(String str) {
		
	Map<Character, Integer>	map=new HashMap<Character, Integer>();
		
	char[]	ch=str.toCharArray();
	for(char c:ch) {
		
		if(map.containsKey(c)) {
			map.put(c, map.get(c)+1);
		}
		else {
			map.put(c, 1);
		}
		
	}
	
	for( Entry<Character, Integer> entry:map.entrySet()) {
		
		System.out.println(entry.getKey() + " " +  entry.getValue());
	}
		
	}
	
	public static void main(String[] args) {
		
		findDuplicate("AAABBBCCCAKKKO");
	}

}
