package com.collectionEx;

public class Customer implements Comparable<Customer>{
	int age;
	String name;
	String address;
	
	public Customer(int age, String name, String address) {
		super();
		this.age=age;
		this.name=name;
		this.address=address;
	}
	
	@Override
	public String toString(){
		return "[age="+age+", name="+name+", address="+address+"]";
	}
	
	@Override
	public int compareTo(Customer c) {
		if(age==c.age) {
			return 0;
		}else if(age>c.age) {
			return 1;
		}else {
			return -1;
		}
	}

}
