package com.globant.bootcamp.UserService;

/**
 * Create, Read, Update and Delete service
 * 
 * @author Zerst
 *
 * @param <T>
 */
public interface CrudService {

	public boolean create(String name, int DNI, String character);

	public Person read(int DNI);

	public boolean update(int DNI, String character);

	public boolean remove(Person person);
}
