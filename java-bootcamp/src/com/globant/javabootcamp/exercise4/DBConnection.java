package com.globant.javabootcamp.exercise4;

public class DBConnection {

	private String path = "";
	private String serverName = "";
	private int port = 0;
	private String protocol = "";

	public DBConnection(String path, String serverName, int port, String protocol) {
		this.path = path;
		this.serverName = serverName;
		this.port = port;
		this.protocol = protocol;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	@Override
	public String toString() {
		return "DBConnection [path=" + path + ", serverName=" + serverName + ", port=" + port + ", protocol=" + protocol + "]";
	}

}
