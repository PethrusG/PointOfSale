/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import integration.Observer;

/**
 * Uses the Observer pattern to update TotalRevenue between different sales
 * @author pethrus
 */
public class TotalRevenueView implements Observer {

	private double totalRevenue;
/**
 * Constructs the class
 */
	public TotalRevenueView() {
		this.totalRevenue = 0;
	}
/**
 * Updates the totalRevenue from all sales since the program started
 * @param purchaseRevenue 
 */
	@Override
	public void updateTotalRevenue(double purchaseRevenue) {
		this.totalRevenue += purchaseRevenue;
		updateDisplay();
	}

	private void updateDisplay() {
		System.out.println("*****************************************");
		System.out.println("Total Revenue so far is: " + this.totalRevenue);
		System.out.println("*****************************************");
	}
	
}
