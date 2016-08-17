package com.assessment;

public class Car extends Vehicle 
{
	int milePerHour = 0;
	int numOfSeats = 0;
	String color = null;
	boolean newTires = false;
	boolean sunRoof = false;


	public void trunOn (){
		isRunning = true;
	}
	
	public void turnOff (){
		isRunning = false;
	}
	
	public void accelerate(){
		
	}
	
	public void decelerate(){
		
	}
}
