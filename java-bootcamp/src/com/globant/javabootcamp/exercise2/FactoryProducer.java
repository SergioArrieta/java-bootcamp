package com.globant.javabootcamp.exercise2;

public class FactoryProducer {

	private static final String MICROSOFT = "Microsoft";
	private static final String ORACLE = "Oracle";

	public static AbstractFactory getFactory(String choice) {

		if (MICROSOFT.equals(choice)) {
			return new MicrosoftFactory();
		} else if (ORACLE.equals(choice)) {
			return new OracleFactory();
		}
		return null;
	}

	public static void main(String[] args) {

		DBConnection connection;

		AbstractFactory factory = getFactory("Microsoft");
		connection = factory.getMicrosoftSQLServerConnection("ODBC");
		connection.connect();
		connection = factory.getMicrosoftSQLServerConnection("OLEDB");
		connection.connect();

		factory = getFactory("Oracle");
		connection = factory.getOracleConnection("ODBC");
		connection.connect();
		connection = factory.getOracleConnection("OLEDB");
		connection.connect();

	}

}
