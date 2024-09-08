package advance;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
	public static void main(String[] args) {
		
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(2,"Ketaki", "Nagur"));
		list.add(new Student(37,"Param", "Nagur"));
		list.add(new Student(10,"Devi", "Nagur"));
		list.add(new Student(27,"Meeta", "Nagur"));
		
		System.out.println("Before sort: "+ list);
		
		Collections.sort(list, new NameComparator());
		
		System.out.println("After sort: "+ list);
		
	}

}
