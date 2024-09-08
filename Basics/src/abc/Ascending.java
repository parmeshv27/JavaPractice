package abc;

public class Ascending {

	
	public static void main(String[] args) {
		int num[]= {1,2,0,4,7,8,10,6,5,7};
		int temp;
		for(int i=0; i<num.length; i++) {			
			for(int j=i+1; j<num.length; j++) {				
				if(num[i]<num[j]) {
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
				
				}
			}
		
		}
		for(int k=0; k<num.length; k++) {
			System.out.print(" " + num[k]);
		}
		int l=num.length;
		System.out.println();
		System.out.println("Highest number from the array is: " + num[0]);
		System.out.println("Lowest number from the array is: " + num[l-1]);
		
		
	}

}
