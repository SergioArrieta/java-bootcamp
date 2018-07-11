package com.globant.javabootcamp.exercise2;

public class MicrosoftOLEDB implements MicrosoftSQLServerConnection {

	@Override
	public void connect() {
		System.out.println("Microsoft OLEDB connection");
	}

}
