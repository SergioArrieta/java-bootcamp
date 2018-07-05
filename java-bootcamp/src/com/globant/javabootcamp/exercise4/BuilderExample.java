package com.globant.javabootcamp.exercise4;

public class BuilderExample {

	public static void main(String[] args) {
		DirectorBuilder director = new DirectorBuilder();
		MicrosoftSQLConnectionBuilder microsoftBuilder = new MicrosoftSQLConnectionBuilder();
		OracleConnectionBuilder oracleBuilder = new OracleConnectionBuilder();

		microsoftBuilder.createNewConnection();
		director.setBuilder(microsoftBuilder);
		director.buildConnection();

		DBConnection connection = director.getConnection();
		System.out.println(connection);

		oracleBuilder.createNewConnection();
		director.setBuilder(oracleBuilder);
		director.buildConnection();

		connection = director.getConnection();
		System.out.println(connection);
	}

}
