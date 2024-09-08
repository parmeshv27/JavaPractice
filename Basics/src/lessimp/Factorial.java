package lessimp;

public class Factorial {
	
	public static void main(String[] args) {
		
		int f4=finFactorial(4);
		System.out.println(f4);
		int f5=finFactorial(5);
		System.out.println(f5);
	}
	
	public static int finFactorial(int num)
	{
		int i=1, fact=1;
		
		for(i=1; i<=num; i++) {
			fact=fact*i;
		}
		return fact;
		
	}
}
