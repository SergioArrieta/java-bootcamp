package com.globant.bootcamp.ShoppingCart;
/**
 * A Shopping Cart for a Web Market
 * @author Sergio Arrieta.
 */
import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Product> cart;

	public ShoppingCart() {
		cart = new ArrayList<Product>();
	}

	public boolean addProduct(Product product) {
		/**
		 * Add a new product to the cart.
		 * @param: a product to add.
		 * @return: true if the product could be added or false if not.
		 */
		return cart.add(product);
	}

	public boolean removeProduct(Product product) {
		/**
		 * Remove a existing product from the cart.
		 * @param: a product to remove.
		 * @return: true is the product could be removed or false if not.
		 */
		return cart.remove(product);
	}

	public double getTotal() {
		/**
		 * Calculate the total price of all product from the cart.
		 * @return: total price of all product.
		 */
		if (cart.size() > 0) {
			return this.cart.stream().mapToDouble(p -> p.getPrice()).sum();
		}
		return 0;
	}

}
