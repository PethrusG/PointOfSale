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
 * Responsible for updating the financial systems after a purchase has been completed.
 */
public class Accounting {
	
	private RunningTotalLog runningTotalLog;
	
	/**
	 * Creates an Accounting interface to the accounting systems, not implemented
	 * as of yet.
	 */
	public Accounting() {

	}
	/**
	 * Receives a static runningTotalLog of the purchase and on that basis it
	 * updates the exteral systems - not implemented.
	 * @param runningTotalLog 
	 */
	public void updateAccounting(RunningTotalLog runningTotalLog) {
		this.runningTotalLog = runningTotalLog;
		// TODO: Update an actual account
	}
}
