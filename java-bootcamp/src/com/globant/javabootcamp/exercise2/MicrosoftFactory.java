package com.globant.javabootcamp.exercise2;

public class MicrosoftFactory implements AbstractFactory{
	
	@Override
	public MicrosoftSQLServerConnection getMicrosoftSQLServerConnection(String factory) {
		if(factory.equals("ODBC"))
				return new MicrosoftODBC();
		if(factory.equals("OLEDB"))
				return new MicrosoftOLEDB();
		return null;
	}
	@Override
	public OracleConnection getOracleConnection(String factory) {
		return null;
	}

}
