package interviewquestions;

public class LeapYear {
	
	public static void main(String[] args) {
		int num=1900;
	boolean b=findLeapYear(num);
	if(b) {
		System.out.println("Entered year is leap year" + b  + num );
	}else {
		System.out.println("Entered year is not leap year" + b + num);
	}
	}
	
	public static boolean findLeapYear(int num){
		boolean flag=false;
		
		if(num%4==0) {			
			if(num%100==0) {
				if(num%400==0) {
					flag=true;
				}else {
					flag=false;
				}				
			}
			else {
				flag=true;
			}
			
			
		}else {
			flag=false;
		}
		
		
		
		return flag;
		
	}

}
