/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import model.RunningTotal;
/**
 *
 * @author pethrus
 * 
 * The default discount class.
 */
public class DiscountNormal implements Discount {
	
	/**
	 * Adds discount based on the customer and items in runningTotal.
	 * @param customer Identifies the customer
	 * @param runningTotal Gives all the items in the customer's basket
	 * @return An updated totalSoFar
	 */
	public double addDiscount(Customer customer, double totalSoFar) {
		return totalSoFar * 0.9;
	}	
}
