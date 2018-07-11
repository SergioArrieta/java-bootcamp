package com.globant.javabootcamp.exercise1;

import com.globant.javabootcamp.db.DBdummy;

public class DBConnection {
	// SINGLETON
	private static DBConnection connection = null;
	private String user = "";
	private String pass = "";

	private DBConnection() {

	}

	public static void setConnection(DBConnection connection) {
		DBConnection.connection = connection;
	}

	public static DBConnection getInstance() {
		if (connection == null) {
			connection = new DBConnection();
		}
		return connection;
	}

	public boolean isConnection() {
		return DBdummy.login(user, pass);
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}