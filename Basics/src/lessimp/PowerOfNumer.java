package lessimp;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PowerOfNumer {
	
	public static void main(String[] args) {
		
		 int base=5, exponent=3, result=1;
		 for(int i=0; i<exponent; i++) {
			 result *=base;
		 }
		 System.out.println(result);
	}

}
