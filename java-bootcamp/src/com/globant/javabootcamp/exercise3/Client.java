package com.globant.javabootcamp.exercise3;

public class Client {

	public static void main(String[] args) {

		DBInterface connection = new Proxy();

		connection.setUser("Juan");
		connection.setPass("f4da22");
		System.out.println(connection.connect());

		connection.setUser("pepito");
		connection.setPass("pepito");
		System.out.println(connection.connect());

		System.out.println(connection.getQuery("Give me a query"));

		System.out.println(connection.closeSession());
	}

}
