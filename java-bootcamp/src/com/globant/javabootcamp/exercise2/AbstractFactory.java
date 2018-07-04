package com.globant.javabootcamp.exercise2;

public interface AbstractFactory {
	
	public MicrosoftSQLServerConnection getMicrosoftSQLServerConnection(String factory);
	public OracleConnection getOracleConnection(String factory);

}
