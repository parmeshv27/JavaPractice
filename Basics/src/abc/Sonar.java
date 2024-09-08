package abc;
public class Sonar {	 
	int a=10;	
	static int b=20;	
	public void m1() {
		System.out.println(" I am non static method m1");
		m3();
		m2();		
	}	
	public static void m2() {
		System.out.println(" I am  static method m2");
	Sonar	ref=new Sonar();
	ref.m3();
	m4();
	}	
	public void m3() {
		System.out.println(" I am non static method m3");
		
	}	
	public static void m4() {
		System.out.println(" I am  static method m4");
		
	}	
}
