package com.Java24hours;
//import java.util.Random;


public class CableModem extends Modem {
	
	String connectionMethod = "cable modem";
	Boolean isConnected;;
	
	
	public void connect() {
		System.out.println("Connecting to internet...");
		System.out.println("via " + connectionMethod);
		
//		// Make mode randomly connect/ not connect
//		Random rd = new Random();
//		System.out.println(rd.nextBoolean());
//		
		
		
	}
	
	// This file CANNOT BE RUN as it does not have a main() method to do so
	// Create another class within this same package named ModemTester with a main() method
}
