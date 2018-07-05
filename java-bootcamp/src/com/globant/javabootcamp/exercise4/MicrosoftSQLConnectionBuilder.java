package com.globant.javabootcamp.exercise4;

public class MicrosoftSQLConnectionBuilder extends AbstractBuilder {
	// Concret Builder

	public void buildPath() {
		super.connection.setPath("default path for Microsoft");
	}

	public void buildServerName() {
		super.connection.setServerName("MicrosoftSQLServer");
	}

	public void buildPort() {
		super.connection.setPort(1433);
	}

	public void buildProtocol() {
		super.connection.setProtocol("TCP/IP");
	}
}
