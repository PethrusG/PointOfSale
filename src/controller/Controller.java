/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.RunningTotal;
import integration.RunningTotalPresentation;
import integration.Customer;
import model.CloseSale;
/**
 *
 * @author pethrus
 * 
 * Provides the interface between the View and the rest of the program.
 * Controls the execution of the program.
 */
public class Controller {

    private RunningTotal runningTotal;	
    private CloseSale closeSale;
    // private CloseSale closeSale;
/**
 * Creates the controller and gives it access to the RunningTotal object.
 * 
 * @param runningTotal 
 */
    public Controller(RunningTotal runningTotal) {
		this.runningTotal = runningTotal;
		closeSale = new CloseSale(runningTotal);
    }

/**
 * Registers one or more items of purchase.
 * 
 * @param itemId The identifier of the item.
 * @param amount Number of items of the same kind.
 * @return Returns a final RunningTotalPresentation object which the View
 * can use to display the result of this method call.
 */
    public RunningTotalPresentation registerItem(int itemId, int amount) {
		RunningTotalPresentation runningTotalPresentation = 
	        runningTotal.registerItem(itemId, amount);
	    return runningTotalPresentation;
    }

    /**
     * Adds the taxes to the sale but the program doesn't end until payPurchase()
     * is called.
 * 
 * @return Returns a final RunningTotalPresentation object which the View
 * can use to display the result of this method call.
     */
    public RunningTotalPresentation closeSaleWithTaxes() {
	    return closeSale.addTaxes();
    }
    /**
     * Adds discount to the sale but the program doesn't end until payPurchase()
     * is called.
     * 
     * @param customer Used to identify exactly what discounts are applicable.
     * @return Returns a final RunningTotalPresentation object which the View
     * can use to display the result of this method call.
     */
    public RunningTotalPresentation closeSaleWithDiscount(Customer customer) {
	    return closeSale.addDiscount(customer);
    }
/**
 * The final method call of the program which provides the change. When this method
 * is called, the sale is also logged in the external systems such as Accounting
 * and Inventory. A receipt will also be printed out.
 * 
 * @param payment The amount that the customer pays for the purchase.
 * @return Returns a final RunningTotalPresentation object which the View
 * can use to display the result of this method call.
 */
    public RunningTotalPresentation payPurchase(double payment) {
	    return new RunningTotalPresentation("Your change is", -1, 
		    closeSale.calculateChange(payment)); 
    }
}
