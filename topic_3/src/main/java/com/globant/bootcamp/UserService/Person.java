package com.globant.bootcamp.UserService;

/**
 * A person class for a DB
 * 
 * @author Sergio Arrieta.
 *
 */
public class Person {

	private String name;
	private int DNI;
	private String characteristics;

	public Person(String name, int DNI, String characteristics) {
		this.name = name;
		this.DNI = DNI;
	}

	public String getName() {
		return name;
	}

	public int getDNI() {
		return DNI;
	}

}
