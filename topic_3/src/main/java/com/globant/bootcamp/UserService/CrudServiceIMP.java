package com.globant.bootcamp.UserService;

/**
 * A CRUD service implementation.
 * @author Sergio Arrieta.
 */
import java.util.stream.Collector.Characteristics;

public class CrudServiceIMP implements CrudService {

	@Override
	public boolean create(String name, int DNI, String characteristics) {
		/**
		 * Create a new object Person and add this to the DB
		 */
		Person person = new Person(name, DNI, characteristics);
		DBDummy.add(person);
		return true;
	}

	@Override
	public Person read(int DNI) {
		/**
		 * Create a person with dates recovered from a DB
		 */
		DBDummy.read(DNI);
		// Create a new person with dates from DBDummy
		Person person = null;
		return person;
	}

	@Override
	public boolean update(int DNI, String characteristics) {
		/**
		 * Update the characteristics of a person.
		 */
		DBDummy.update(DNI, characteristics);
		return false;
	}

	@Override
	public boolean delete(Person person) {
		/**
		 * Delete a person.
		 */
		DBDummy.delete(person.getDNI());
		return false;
	}

}