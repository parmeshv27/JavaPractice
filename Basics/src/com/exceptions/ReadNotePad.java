package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNotePad {
	
	public static void main(String[] args) throws FileNotFoundException {
		
	File	file=new File("D:\\Parm Info\\java.txt");
	
    Scanner	sc=new Scanner(file);
    
    while(sc.hasNextLine()) {
    	System.out.println(sc.nextLine());
    }
		
	}

}
