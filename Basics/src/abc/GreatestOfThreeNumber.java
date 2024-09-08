package abc;

public class GreatestOfThreeNumber {
	
	public static void main(String[] args) {
		
		int n1=210, n2=49, n3=640;
		
		if(n1>n2) {
			if(n1>n3) {
				System.out.println("Biggest nubmer is: "+ n1);
			}
			else {
				System.out.println("Biggest number is:"+ n3);
			}
		}else if(n2>n3) {
			System.out.println("Biggest number is: "+ n2);
		}else {
			System.out.println("Biggest number is: "+ n3);
		}
		
		
		
	}
}
