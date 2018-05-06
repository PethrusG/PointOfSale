/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import integration.Accounting;
import integration.Inventory;
import integration.Printer;
import integration.RunningTotalLog;
/**
 *
 * @author pethrus
 * 
 * Responsible for logging the sale in the external systems such as Accounting
 * and Inventory and also for printing the receipt once the sale is over.
 */
public class CompanyLog {
		
	private Inventory inventory;
	private Accounting accounting;
	private Printer printer;

	/** 
	 * Creates a CompanyLog and gives it a reference to the Inventory to be able
	 * to update it.
	 * 
	 * @param inventory All the goods that the store has. 
	 */
	public CompanyLog(Inventory inventory) {
		this.inventory = inventory;
		this.accounting = new Accounting();
		this.printer = new Printer();
	}

	/**
	 * Logs the sale in the external systems such as Accounting ad Inventory
	 * and prints the receipt of purchase.
	 * 
	 * @param runningTotalLog 
	 */
	public void logSale(RunningTotalLog runningTotalLog) {
		inventory.updateInventory(runningTotalLog);
		accounting.updateAccounting(runningTotalLog);
		printer.printReceipt(runningTotalLog);
	}
}
