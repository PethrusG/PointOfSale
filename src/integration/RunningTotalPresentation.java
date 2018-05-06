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
 * Used as a final DTO of RunningTotal to be sent to the View.
 */
public class RunningTotalPresentation {
	
	private final String itemDescription;
	private final double price;
	private final double totalSoFar;

	/**
	 * Creates new RunningTotalPresentation
	 * @param itemDescription Describes the item in human language
	 * @param price Price of the current item
	 * @param totalSoFar The total so far
	 */
	public RunningTotalPresentation(String itemDescription, double price, double totalSoFar) {
		this.itemDescription = itemDescription;
		this.price = price;
		this.totalSoFar = totalSoFar;
	}

	/**
	 * 
	 * @return Decription of current item in human language
	 */
	public String getItemDescription() {
		return itemDescription;
	}
	/**
	 * 
	 * @return Price of current item
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * 
	 * @return Total so far in the purchase
	 */
	public double getTotalSoFar() {
		return totalSoFar;
	}
}
