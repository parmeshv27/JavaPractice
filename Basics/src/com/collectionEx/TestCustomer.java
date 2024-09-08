package com.collectionEx;

import java.util.ArrayList;
import java.util.Collections;

public class TestCustomer {
	public static void main(String[] args) {
		
	ArrayList<Customer>	list=new ArrayList<Customer>();
	list.add(new Customer(2, "Ketaki", "Nagur"));
	list.add(new Customer(27, "Meeta", "Nagur"));
	list.add(new Customer(37, "Param", "Nagur"));
	list.add(new Customer(10, "Devi", "Nagur"));
	
	System.out.println("Before sort:"+list);
	Collections.sort(list);
	System.out.println("After sort:"+list);
	}

}
