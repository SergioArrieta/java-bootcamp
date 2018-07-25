package com.globant.bootcamp.Service;
/**
 * A Shooping Cart service.
 * @author Sergio Arrieta.
 */

import com.globant.bootcamp.ShoppingCart.*;

public interface ShoppingService {

	public double getPrice();

	public boolean addProduct(Product product);

	public boolean removeProduct(Product product);

}
