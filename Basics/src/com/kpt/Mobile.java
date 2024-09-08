package com.kpt;

public abstract class Mobile {
	
	Mobile(){
		
	}
	
  abstract	void clickPhoto();
	
	public void switchOn() {
		System.out.println("Switching on ");
	}
	
public void switchOff() {
		System.out.println("Switching off");
	}

}
