package com.mp;

public class ShopOwner {
	public Animal give(String name){
		Animal an = null;
		if(name.equals("Cow")) {
			an=new Cow();
		}
		
		if(name.equals("Cat")) {
			an=new Cat();
		}
		
		if(name.equals("Dog")) {
			an=new Dog();
		}		
	return an;			
	}
}
