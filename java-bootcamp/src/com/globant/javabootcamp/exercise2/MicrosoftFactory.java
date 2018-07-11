package com.globant.javabootcamp.exercise2;

public class MicrosoftFactory implements AbstractFactory {
	
	private static final String ODBC = "ODBC";
	private static final String OLEDB = "OLEDB";

	@Override
	public MicrosoftSQLServerConnection getMicrosoftSQLServerConnection(String factory) {
		if (ODBC.equals(factory))
			return new MicrosoftODBC();
		if (OLEDB.equals(factory))
			return new MicrosoftOLEDB();
		return null;
	}

	@Override
	public OracleConnection getOracleConnection(String factory) {
		return null;
	}

}
