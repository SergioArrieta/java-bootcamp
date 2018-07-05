package com.globant.javabootcamp.exercise2;

public class MicrosoftODBC implements MicrosoftSQLServerConnection {

	@Override
	public void connect() {
		System.out.println("Microsoft ODBC connection");

	}
}
