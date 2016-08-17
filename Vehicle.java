package com.assessment;

public class Vehicle
{
	public boolean isRunning = false;
	public String color = null;
	public String style = null;
	public boolean isMoving = false;
	
	public void trunOn (){
		isRunning = true;
	}
	
	public void turnOff (){
		isRunning = false;
	}
	
	public void shiftGear(){
		isMoving = true;
	}
	
}
