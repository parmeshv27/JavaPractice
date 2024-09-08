package lessimp;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {
	
	public static void main(String[] args) {
		
		String st="Param nagur Bidar Meeta nagur Bidar Ketaki nagur Bidar VTU";
		
	ArrayList<String>	list=new ArrayList<String>();
	

		String[] str=st.split(" ");
		for(String s:str) {
			list.add(s);
		}
		Collections.sort(list);
		
		// Find the no of occurance of word
		int counter;
		
		for(int i=0; i<list.size(); i++) {
			counter=1;
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i).equals(list.get(j))) {
					counter++;
				}		else {
					break;
				}
			}
			System.out.println("Word and it's occurance is" + list.get(i) + " : " + counter);
		i +=counter-1;
		}
		
	}

}
