package interviewquestions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SystemDetails {
	
	
	
	public static void main(String[] args) {
		
    String osName=System.getProperty("os.name");
    System.out.println("osName is :"+osName); 
    String timeStamp = new SimpleDateFormat("dd/mm/yy_hh:mm:ss").format(Calendar.getInstance().getTime());
    System.out.println("Curretn date and time is :" +timeStamp);
    
//		 System.getProperties().list(System.out);
	}

}
