package advance;

public class Student {
	int age;
	String name;
	String address;
	
	public Student(int age, String name, String address) {
		super();
		this.age=age;
		this.name=name;
		this.address=address;
	}
	@Override
	public String toString(){
		return "[age="+age+", name="+name+", address="+address+"]";
	}

}
