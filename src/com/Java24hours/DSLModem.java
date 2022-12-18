package com.Java24hours;

public class DSLModem extends Modem{
	
	 String connectionMethod = "DSL modem";
	
	public void connect() {
		System.out.println("Connecting to internet ...");
		System.out.println("via " + connectionMethod);
	}

}
