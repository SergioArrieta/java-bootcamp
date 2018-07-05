package com.globant.javabootcamp.exercise2;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {

		if (choice.equalsIgnoreCase("Microsoft")) {
			return new MicrosoftFactory();
		} else if (choice.equalsIgnoreCase("Oracle")) {
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
