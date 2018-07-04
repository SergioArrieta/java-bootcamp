package com.globant.javabootcamp.db;

public class DBdummy {

	public static boolean connection = false;

	public static boolean login(String user, String pass) {

		if (!connection)
			if (user.equals("SergioArrieta") && (pass.equals("abcd33"))) {
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
