package com.globant.bootcamp.UserService;

/**
 * A CRUD service implementation.
 * @author Sergio Arrieta.
 */
import java.util.stream.Collector.Characteristics;

public class CrudServiceImpl implements CrudService {

	/**
	 * Create a new object Person and add this to the DB
	 */
	@Override
	public boolean create(String name, int DNI, String characteristics) {
		Person person = new Person(name, DNI, characteristics);
		DBDummy.add(person);
		return true;
	}

	/**
	 * Create a person with dates recovered from a DB
	 */
	@Override
	public Person read(int DNI) {
		DBDummy.read(DNI);
		// Create a new person with dates from DBDummy
		Person person = null;
		return person;
	}

	/**
	 * Update the characteristics of a person.
	 */
	@Override
	public boolean update(int DNI, String characteristics) {
		DBDummy.update(DNI, characteristics);
		return false;
	}

	@Override
	public boolean remove(Person person) {
		DBDummy.delete(person.getDNI());
		return false;
	}

}