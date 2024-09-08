package abc;

import java.util.HashMap;
import java.util.Map.Entry;

public class Test4 {
	
	public static void main(String[] args) {
		
		String str="ABHHDLHADLHD";
	HashMap<Character, Integer>	map=new HashMap<Character, Integer>();
		char[] c=str.toCharArray();
		
		for(char d:c) {
			if(map.containsKey(d)) {
				map.put(d, map.get(d)+1);
			}
			else {
				map.put(d, 1);
			}
				}
		
		for(Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+  " " + entry.getValue());
		}
		
		}
	
	}

