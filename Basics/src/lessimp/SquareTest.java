package lessimp;

public class SquareTest {
	
	public static void main(String[] args) {
		
		int a=18, r;
		boolean flag=false;
		
		for(int i=2; i<a; i++) {
			
			r=i*i;
			if(r<=a) {
				if(r==a) {
					System.out.println("Given number is square of :" + i);
					flag=true;
					break;
				}
			}else {
				break;
			}
						
		
	}
		
		if(!flag) {
			System.out.println("Not a square number:" + a);
		}
		
}
	
}
