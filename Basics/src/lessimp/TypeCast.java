package lessimp;

public class TypeCast {
	public static void main(String[] args) {
//		Typecasting is converting data from one data type to another data type.
//		Typecasting can be applied to both primitive and non-primitive types.
	
		int a=10;		
		double b=a;
		System.out.println("Converted value of a is : " + b);
		
		float f=3.456f;
		System.out.println("Before type case value of f is :" +f );
		int i=(int)f;
		System.out.println("After type case value of f is :" +i );
		
		 double d = 3.456;
		System.out.println("Before type case value of d is :" +d );
		int id=(int)d;
		System.out.println("After type case value of d is :" +i );
	}

}
