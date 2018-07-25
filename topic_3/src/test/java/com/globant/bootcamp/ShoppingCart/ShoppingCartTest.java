package com.globant.bootcamp.ShoppingCart;

import org.junit.Assert;
import org.junit.Test;

import com.globant.bootcamp.Service.ShoppingService;
import com.globant.bootcamp.Service.ShoppingServiceImpl;

import junit.framework.TestCase;

class ShoppingCartTest extends TestCase {

	private ShoppingService ShoppingCart;
	private Product product1;
	private Product product2;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		ShoppingCart = new ShoppingServiceImpl();
		product1 = new Product("Name", "Category", 15.5);
		product2 = new Product("Name2", "Category", 15.5);
	}

	@Test
	public void testForAddANewProductToTheCart() {
		Assert.assertEquals(true, ShoppingCart.addProduct(product1));
	}

	@Test
	public void testForRemoveAProductFromTheCart() {
		Assert.assertEquals(true, ShoppingCart.removeProduct(product1));

	}

	@Test
	public void testForCalculateTheTotalPriceForTheCart() {
		ShoppingCart.addProduct(product2);
		Assert.assertEquals(31, ShoppingCart.getPrice());
	}

}
