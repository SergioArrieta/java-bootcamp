package com.globant.javabootcamp.exercise3;

public interface DBInterface {

	public void setUser(String user);

	public void setPass(String pass);

	public String getUser();

	public String getPass();

	public String getQuery(String request);

	public boolean connect();

	public boolean closeSession();

}
