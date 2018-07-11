package com.globant.javabootcamp.db;

public class DBdummy {

	public static boolean connection = false;

	private final static String USER_CONNECTION = "SergioArrieta";
	private final static String PASS_CONNECTION = "abcd33";

	public static boolean login(String user, String pass) {

		if (!connection) {
			if (USER_CONNECTION.equals(user) && (PASS_CONNECTION.equals(pass))) {
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
