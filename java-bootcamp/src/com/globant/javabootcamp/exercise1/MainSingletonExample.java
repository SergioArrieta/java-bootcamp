package com.globant.javabootcamp.exercise1;

public class MainSingletonExample {

	public static void main(String[] args) {
		
		DBConnection connection1 = DBConnection.getInstance();
		connection1.setUser("Juan");
		connection1.setPass("fdasdf3");
		System.out.println(connection1.connection());
		
		connection1.setUser("SergioArrieta");
		connection1.setPass("abcd33");
		DBConnection connection2 = DBConnection.getInstance();
		System.out.println(connection2.connection()); //Returns true, because connection1 and connection2 are the same intance!

	}

}
