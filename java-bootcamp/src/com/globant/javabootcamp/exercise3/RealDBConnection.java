package com.globant.javabootcamp.exercise3;

import com.globant.javabootcamp.db.DBdummy;

public class RealDBConnection implements DBInterface {

	private String user;
	private String pass;

	@Override
	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String getUser() {
		return user;
	}

	@Override
	public String getPass() {
		return pass;
	}

	@Override
	public String getQuery(String request) {
		return DBdummy.query(request);
	}

	@Override
	public boolean connect() {
		return DBdummy.login(user, pass);
	}

	@Override
	public boolean closeSession() {
		return DBdummy.closeSession();
	}
}
