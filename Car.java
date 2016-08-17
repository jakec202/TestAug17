package com.Test1;

public class Car extends Vehicle{
	
	String model = null;
	String make = null;
	
	
	public static void moving(){
		isRunning = true;
	} //moving method
	
	public static void parked(){
		isRunning = false;
	}
	
	public static void windowsBroken(){
		for (int i = 0; i<4;i--);
				
	}

	public void lightsOn() {
			}
	
	public void usingBrake(){
		isRunning = false;
	}
	
	
	
	
} // Car Class
