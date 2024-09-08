package com.exceptions;

public class Throw {  
    //defining a method  
    public static void checkNum(int num) {  
        if (num < 1) {  
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
        }  
        else {  
            System.out.println("Square of " + num + " is " + (num*num));  
        }  
    }  
    //main method  
    public static void main(String[] args) {  
    	Throw obj = new Throw();  
            obj.checkNum(-3);  
            System.out.println("Rest of the code..");  
    }  
}  