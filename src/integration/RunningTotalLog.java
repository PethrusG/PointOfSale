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
 * A final representation of the sale. Used as a DTO instead of sending around
 * RunningTotal
 */
public class RunningTotalLog {
	
	private final ListOfCurrentItems listOfItems;
	private final double total;

	/**
	 * Creates a new RunningTotalLog
	 * @param listOfItems The items in the customer's basket
	 * @param total The total amount that the customer will pay.
	 */
	public RunningTotalLog(ListOfCurrentItems listOfItems, double total) {
		this.listOfItems = listOfItems;
		this.total = total;
	}

	public double getTotal() {
		return this.total;
	}
}
