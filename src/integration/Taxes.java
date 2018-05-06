/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

/**
 *
 * @author pethrus
 * Represents the taxes to be added to the purchase
 */
public class Taxes {
	
	/**
	 * Adds taxes to the purchase
	 * @param totalSoFar The total so far of the purchase
	 * @return An updated totalSoFar
	 */
	public double addTaxes(double totalSoFar) {
		return totalSoFar * 1.25;
	}
}

