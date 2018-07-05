package com.globant.javabootcamp.db;

public class DBdummy {

	public static boolean connection = false;

	private final static String userConnection = "SergioArrieta";
	private final static String passConnection = "abcd33";

	public static boolean login(String user, String pass) {

		if (!connection) {
			if (userConnection.equals(user) && (passConnection.equals(pass))) {
				connection = true;
				return true;
			}
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
