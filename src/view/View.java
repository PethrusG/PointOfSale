/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import integration.RunningTotalPresentation;
import static java.lang.System.out;
import integration.Customer;
/**
 *
 * @author pethrus
 * 
 * Represents the View of the Point Of Sale
 * When no real view interface is provided, the program may be tested
 * using hard-coded method calls to the Controller as seen in sampleExecution().
 */
public class View {
	
	private Controller controller;
	private Customer customer;
	private RunningTotalPresentation runningTotalPresentation;
	
/**
 * Creates the View and gives it references to the Controller and Customer.
 * @param controller The controller of the program to which all calls from the
 * 	                 View are made.
 * @param customer The customer of the current purchase. Used to calculate discount.
 */	
	public View(Controller controller, Customer customer) {
		this.controller = controller;
		this.customer = customer;
	}
/**
 * Provides a sample execution of the program in lack of a real view interface.
 * Prints the result to standard output.
 */	
	public void sampleExecution() {
		this.runningTotalPresentation = controller.registerItem(77, 1);
		showDisplay(runningTotalPresentation);
		this.runningTotalPresentation = controller.registerItem(95, 1);
		showDisplay(runningTotalPresentation);
		this.runningTotalPresentation = controller.registerItem(107, 1);
		showDisplay(runningTotalPresentation);
		this.runningTotalPresentation = controller.closeSaleWithTaxes();
		showDisplay(runningTotalPresentation);
		this.runningTotalPresentation = controller.closeSaleWithDiscount(customer);
		showDisplay(runningTotalPresentation);
		this.runningTotalPresentation = controller.payPurchase(60);
		showDisplay(runningTotalPresentation);
		
	}	

	private void showDisplay(RunningTotalPresentation runningTotalPresentation) {
		
		String description = runningTotalPresentation.getItemDescription();
		double price = runningTotalPresentation.getPrice();
		double totalSoFar = runningTotalPresentation.getTotalSoFar();
		
		out.println("Item description: \t" + description);
		out.println("Item price: \t" + price);
		out.println("Total so far: \t" + totalSoFar);
		out.println("");
	}
}
