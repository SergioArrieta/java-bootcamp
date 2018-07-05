package com.globant.javabootcamp.exercise4;

public abstract class AbstractBuilder {
	// Abstract Builder
	protected DBConnection connection;

	public abstract void buildPath();

	public abstract void buildServerName();

	public abstract void buildPort();

	public abstract void buildProtocol();
	
	public void createNewConnection() {
		connection = new DBConnection();
	}

	public DBConnection getConnection() {
		return connection;
	}

}
