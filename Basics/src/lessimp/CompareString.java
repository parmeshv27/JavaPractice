package lessimp;

import java.util.ArrayList;

public class CompareString {
	
	// This program to remove duplicate string and print them 
	
	public static void main(String[] args) {
		
		String st="Param nagur Bidar Meeta nagur Bidar Ketaki Nagur Bidar VTU";
		
		ArrayList<String> list = new ArrayList<String>();
		String[] s=st.split("\\s");
		for(String s1:s) {
			list.add(s1);
		}
		
		for(int i=0; i<list.size(); i++) {
			boolean flag=false;
		for(int j=0; j<list.size(); j++) {
			if(i !=j && list.get(i).equals(list.get(j))) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(list.get(i));
		}
		}
		
	}

}
