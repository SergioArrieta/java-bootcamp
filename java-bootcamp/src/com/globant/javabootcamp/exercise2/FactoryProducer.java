package com.globant.javabootcamp.exercise2;

public class FactoryProducer {
	
	private static final String microsoft = "Microsoft";
	private static final String oracle = "Oracle";

	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase(microsoft)) {
			return new MicrosoftFactory();
		} else if (choice.equalsIgnoreCase(oracle)) {
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
