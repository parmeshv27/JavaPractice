package abc;

public class PrintPyramidNumber {
	
	public static void main(String[] args) {
		
		int row=6;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<=i;j++) {
				
				System.out.print(j+1);
			}
			System.out.println();
		}
	}

}
