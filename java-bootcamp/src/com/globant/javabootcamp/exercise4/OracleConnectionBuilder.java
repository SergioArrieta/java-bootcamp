package com.globant.javabootcamp.exercise4;

public class OracleConnectionBuilder extends AbstractBuilder {
	// Concret Builder

	public void buildPath() {
		super.connection.setPath("default path for Oracle");
	}

	public void buildServerName() {
		super.connection.setServerName("Oracle");
	}

	public void buildPort() {
		super.connection.setPort(1521);
	}

	public void buildProtocol() {
		super.connection.setProtocol("TCP");
	}

}
