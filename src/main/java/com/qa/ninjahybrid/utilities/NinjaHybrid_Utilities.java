package com.qa.ninjahybrid.utilities;

import java.util.Date;

public class NinjaHybrid_Utilities {
	
	public static String generateEmailWithTimeStamp() {
		Date date = new Date();
		String emailTimeStamp = date.toString().replace("", "_").replace(":", "_");
		return "shajlee" +emailTimeStamp+ "@yahoo.com";
	}
	public static CharSequence generatePasswordWithTimeStamp() {
		Date date1 = new Date();
		String passwordTimeStamp = date1.toString().replace("", "_").replace(":", "_");
		return "Potter1@" + passwordTimeStamp;
	}
	public static String generateRegistrationEmailWithTimeStamp() {
		Date date2 = new Date();
		String usernameTimeStamp = date2.toString().replace("", "_").replace(":", "_");
		return "chowdhurygs" +usernameTimeStamp+ "@gmail.com";
	}
	public static CharSequence generateRegistrationPasswordWithTimeStamp() {
		Date date3 = new Date();
		String registrationPasswordTimeStamp = date3.toString().replace("", "_").replace(",", "_");
		return "Namar1" + registrationPasswordTimeStamp;
	}
	public static final int IMPLICIT_WAIT_TIME = 10;
	public static final int PAGELOAD_WAIT_TIME = 10;
	public static final int SCRIPTLOAD_TIME = 100;
	
	}


