package com.globant.javabootcamp.exercise4;

public class BuilderExample {

	private static void main(String[] args) {

		DBConnection connection = new ConnectionBuilder().setPath("path").setPort(1433).setProtocol("TPC").setServerName("Microsoft")
				.buildConnection();
		System.out.println(connection);

	}

}
