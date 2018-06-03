/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

/**
 * Defines what a class dealing with discounts should include
 * @author pethrus
 */
public interface Discount {
	
	/**
	 * Adds a discount to the totalSoFar
	 * @param customer The customer of the current purchase
	 * @param totalSoFar The total that the customer is going to pay so far
	 * @return 
	 */
	public double addDiscount(Customer customer, double totalSoFar); 
}
