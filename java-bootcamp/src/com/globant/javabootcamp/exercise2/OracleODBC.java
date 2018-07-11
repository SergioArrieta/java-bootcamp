package com.globant.javabootcamp.exercise2;

public class OracleODBC implements OracleConnection {

	@Override
	public void connect() {
		System.out.println("Oracle ODBC connection");
	}
}
