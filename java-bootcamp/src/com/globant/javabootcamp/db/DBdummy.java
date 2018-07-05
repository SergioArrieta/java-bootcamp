package com.globant.javabootcamp.db;

public class DBdummy {

	public static boolean connection = false;
	
	private final static String userConnect = "SergioArrieta";
	private final static String passConnect = "abcd33";

	public static boolean login(String user, String pass) {
		
		if (!connection)
			if (user.equals(userConnect) && (pass.equals(passConnect))) {
				connection = true;
				return true;
			}
		return false;
	}

	public static boolean closeSession() {
		if (connection) {
			connection = false;
			return true;
		}
		return false;
	}

	public static String query(String request) {
		return "This is a query";
	}
}
