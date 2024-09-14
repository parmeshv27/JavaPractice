package interviewquestions;

import java.util.HashMap;

public class MapError {
	
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key1", "value3");
	//It will override value for the duplicate value	
		System.out.println(map);
		
	}

}
