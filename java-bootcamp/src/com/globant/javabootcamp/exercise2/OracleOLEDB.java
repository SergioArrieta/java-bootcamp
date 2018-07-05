package com.globant.javabootcamp.exercise2;

public class OracleOLEDB implements OracleConnection {

	@Override
	public void connect() {
		System.out.println("Oracle OLEDB connection");
	}

}
