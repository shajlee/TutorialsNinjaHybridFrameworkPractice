package com.qa.ninjahybrid.utilities;

public class NinjaHybrid_System {
	
	public static void main(String [] args) {
		System.getProperties().list(System.out);
		System.out.println("------------------------------");
		System.out.println("******************************");
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.vm.vendor"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.country"));
		
		
	}

}
