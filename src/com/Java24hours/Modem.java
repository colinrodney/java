package com.Java24hours;
import java.util.Random;


/*
 *  Classes are templates that both DESCRIBE an object (attributes)
 *  and dictate its BEHAVIOR (methods)
 *  */
public class Modem {
	
	// Common attribute between all modems is speed and
	// is declared as a class variable to be shared across all instances
	int speed;
	Boolean isConnected;
	
	// initialize instance of Random class
	Random rd = new Random();
	
	
	public void displaySpeed() {
		System.out.println("speed: " + speed);
	}
	
	
	// Returns a random connection status when called by connectionStatus() method
	public Boolean isConnected() {
		return rd.nextBoolean();
	}
	
	public void connectionStatus() {
		if (isConnected()) {
			System.out.println("Connected");
		}
		else {
			System.out.println("Not connected");
		}
	}
}
