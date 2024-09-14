package lessimp;

import java.util.ArrayList;

public class Ascending {
	
	public static void main(String[] args) {
String st="Param Nagur Bidar Meeta Nagur Bidar Ketaki Nagur Bidar VTU";
		
		ArrayList<String> list = new ArrayList<String>();
		String[] s=st.split("\\s");
		for(String s1:s) {
			list.add(s1);
		}
		
		String temp="";
		
		for(int i=0; i<list.size(); i++) {
			for(int j=0; j<list.size(); j++) {
				
				if(i!=j && list.get(i).compareTo(list.get(j))<0) {
					temp=list.get(j);
					list.set(j, list.get(i));
					list.set(i, temp);
				}
			}

		}
		
	for(int i=0; i<list.size(); i++) {
		System.out.print(list.get(i) + " ");
	}
	}

}
