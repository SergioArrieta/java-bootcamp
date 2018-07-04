package com.globant.javabootcamp.exercise1;

import com.globant.javabootcamp.db.DBdummy;

public class DBConnection {
	//SINGLETON 
	private static DBConnection connection = null;
	private String user = "";
	private String pass = "";
	
	public static void setConnection(DBConnection connection) {
		DBConnection.connection = connection;
	}

	private DBConnection() {
		
	}
	
	public static DBConnection getInstance() {
		
		if (connection == null){
			connection = new DBConnection();
		}
		return connection;
	}
	
	public boolean connection() {
		return DBdummy.login(user,pass);
	}
	
	public void setUser(String user) {
		this.user = user;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}