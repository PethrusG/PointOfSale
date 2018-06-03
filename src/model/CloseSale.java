/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.RunningTotal;
import model.CompanyLog;
import integration.Taxes;
import integration.Discount;
import integration.RunningTotalPresentation;
import integration.Customer;
import integration.DiscountNormal;
import integration.DiscountSpecial;
import integration.Observable;
import integration.Observer;
import integration.RunningTotalLog;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pethrus
 * 
 * Takes over the handling of the purhcase when the Customer is done registering
 * goods. Adds taxes, discount, calculates change and logs the sale in the 
 * external systems as well as prints the receipt.
 */
public class CloseSale implements Observable{

	private RunningTotal runningTotal;
	private Taxes taxes;
	private Discount discount;
	private CompanyLog companyLog;
	private List<Observer> observers;

	/**
	 * Creates CloseSale and gives it access to the current RunningTotal object
	 * from which it can finalize the sale.
	 * 
	 * @param runningTotal The current state of the sale
	 */
	public CloseSale(RunningTotal runningTotal) {
		this.runningTotal = runningTotal;
		this.taxes = new Taxes();
		this.discount = new DiscountNormal();
		this.companyLog = new CompanyLog(runningTotal.getInventory());
		this.observers = new ArrayList<>();
	}	
	/**
	 * Adds taxes to the current RunningTotal object
	 * @return Returns a final RunningTotalPresentation to the View to present
	 * the new total with taxes.
	 */
	public RunningTotalPresentation addTaxes() {
		runningTotal.setNewTotalSoFar(taxes.addTaxes(runningTotal.getTotalSoFar()));
		return new RunningTotalPresentation("Total With Taxes", -1, 
			runningTotal.getTotalSoFar());
	}
	/**
	 * Adds discount to the current RunningTotal object based on the current customer
	 * @param customer Current customer on which discount is based
	 * @return Returns a final RunningTotalPresentation to the View to present
	 * the new total with discount.
	 */
	public RunningTotalPresentation addDiscount(Customer customer) {
		runningTotal.setNewTotalSoFar(discount.addDiscount(customer, runningTotal.getTotalSoFar()));
		return new RunningTotalPresentation("Total With Discount", -1, 
			runningTotal.getTotalSoFar());
	}
/**
 * Sets a special discount that is not the normal one by means of using the
 * Strategy pattern.
 */
	public void setDiscountSpecial() {
		discount = new DiscountSpecial();
	}
	/** 
	 * Calculates the change once the purchase is over. Also logs the sale in the
	 * external systems.
	 * @param payment The payment on which the change should be based.
	 * @return 
	 */
	public double calculateChange(double payment) {
		logSale();	
		// TODO: Add what happend if payment is not enough
		return payment - runningTotal.getTotalSoFar();
	}

	private void logSale() {
		RunningTotalLog runningTotalLog = 
			new RunningTotalLog(runningTotal.getListOfCurrentItems(), 
				runningTotal.getTotalSoFar());
		companyLog.logSale(runningTotalLog);
		notifyObservers();
	}
/**
 * Adds an observer 
 * @param o Observer to be added
 */
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}
/**
 * Removes an observer
 * @param o Observer to be removed
 */
	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
/** 
 * Used to notify observers once there is a state update.
 */
	@Override
	public void notifyObservers() {
		for(Observer o: observers)
			o.updateTotalRevenue(runningTotal.getTotalSoFar());
	}

}
