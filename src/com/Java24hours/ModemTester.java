package com.Java24hours;

public class ModemTester {
	
	// This main() method is part of a class resides in the SAME PACKAGE as
	// the other files needed to run this application!
	
	public static void main(String[] args) {
		// Create objects of each type of modem
		CableModem surfBoard = new CableModem();
		DSLModem gateway = new DSLModem();
		Commodore64Modem commodore = new Commodore64Modem();
		
		// Set speeds for each object -
		// "speed" variable is inherited from 'Modem' as it is a superclass to both
		// CableModem and DSLModem
		// Objects created from a subclass CAN implement METHODS and VARIABLES from its
		// superclass!
		surfBoard.speed = 500000;
		gateway.speed = 400000;
		commodore.speed = 300;
		
		System.out.println("Testing cable modem: ");
		surfBoard.displaySpeed();
		surfBoard.connect();
//		surfBoard.isConnected();
		surfBoard.connectionStatus();
		
		System.out.println("\n Testing DSL Modem: ");
		gateway.displaySpeed();
		gateway.connect();
//		gateway.isConnected();
		gateway.connectionStatus();
		
		// Commodore 64 Modem
		System.out.println("\n Testing Commodore 64 Modem: ");
		commodore.displaySpeed();
		commodore.connect();
//		commodore.isConnected();
		commodore.connectionStatus();
		
	}
}
