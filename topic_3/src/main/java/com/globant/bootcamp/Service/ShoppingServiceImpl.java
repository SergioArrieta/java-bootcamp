package com.globant.bootcamp.Service;

/**
 * A implement for a ShoppingCart Service.
 * @author Sergio Arrieta.
 */
import com.globant.bootcamp.ShoppingCart.ShoppingCart;
import com.globant.bootcamp.ShoppingCart.Product;

public class ShoppingServiceImpl implements ShoppingService {

	private ShoppingCart cart;

	public ShoppingServiceImpl() {
		cart = new ShoppingCart();
	}

	@Override
	public double getPrice() {
		return cart.getTotal();
	}

	@Override
	public boolean addProduct(Product product) {
		return cart.addProduct(product);
	}

	@Override
	public boolean removeProduct(Product product) {
		return cart.removeProduct(product);
	}

}
