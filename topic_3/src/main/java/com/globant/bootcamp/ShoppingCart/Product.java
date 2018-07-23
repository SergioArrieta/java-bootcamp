package com.globant.bootcamp.ShoppingCart;

/**
 * A product from a Shopping Cart.
 * 
 * @author Sergio Arrieta.
 *
 */
public class Product {

	private String name;
	private String category;
	private double price;

	public Product(String name, String category, double price) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public boolean equals(Object obj) {
		/**
		 * I redefine the method equals for remove a product from a Shooping Cart.
		 */
		if (obj instanceof Product) {
			Product p = (Product) obj;
			if (this.name.equals(p.getName()) && this.category.equals(p.getCategory())) {
				return true;
			}
		}
		return false;
	}

}
