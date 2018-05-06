/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

/**
 *
 * @author pethrus
 * 
 * Represents a customer. Is needed to know what discounts apply.
 */
public class Customer {
	
	private int customerId;

	/**
	 * Creates a new customer
	 * @param customerId Identifier that identifies a specific customer.
	 */
	public Customer(int customerId) {
		this.customerId = customerId;
	}
	/**
	 * Retrieves the customer identifier
	 * @return customer identifier:w
	 */
	
	public int getCustomerId() {
		return customerId;
    }	
}
