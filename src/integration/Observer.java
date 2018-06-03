/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

/**
 * Used by a class that wants to observe another class
 * @author pethrus
 */
public interface Observer {
	
	/**
	 * Used by the observable classes to update the state of the Observer
	 * @param totalRevenue The value by which the Observer should be updated with
	 */
	public void updateTotalRevenue(double totalRevenue);
}
