package interviewquestions;

import java.time.YearMonth;

public class FindDays {
	
	public static void main(String[] args) {
		YearMonth yearMonthObject = YearMonth.of(1700, 2);
		int daysInMonth = yearMonthObject.lengthOfMonth(); //28 
		
		System.out.println(daysInMonth);
		
		
	}

}
