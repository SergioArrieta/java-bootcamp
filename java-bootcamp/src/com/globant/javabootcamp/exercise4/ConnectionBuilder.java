package com.globant.javabootcamp.exercise4;

public class ConnectionBuilder {

	private String path = "";
	private String serverName = "";
	private int port = 0;
	private String protocol = "";

	public ConnectionBuilder setPath(String path) {
		this.path = path;
		return this;
	}

	public ConnectionBuilder setServerName(String serverName) {
		this.serverName = serverName;
		return this;
	}

	public ConnectionBuilder setPort(int port) {
		this.port = port;
		return this;
	}

	public ConnectionBuilder setProtocol(String protocol) {
		this.protocol = protocol;
		return this;
	}

	public DBConnection buildConnection() {
		return new DBConnection(path, serverName, port, protocol);
	}

}
