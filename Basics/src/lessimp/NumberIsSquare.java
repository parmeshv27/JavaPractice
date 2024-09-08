package lessimp;

public class NumberIsSquare {
	
	public static void main(String[] args) {
		
		int b=625;
		boolean flag=false;
		for(int i=2; i<b; i++) {
			 flag=false;
			int v=i*i;
			if(v==b) {
				flag=true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Number is perfect square :"+ b);
		}else {
			System.out.println("Number is not sqaure :"+ b);
		}
	}

}
