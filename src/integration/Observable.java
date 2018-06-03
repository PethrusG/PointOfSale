/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

/**
 * An interface for the class that should update the observer
 * @author pethrus
 */
public interface Observable {
	
	/**
	 * Add a new observer
	 * @param o The observer to be added
	 */
	public void addObserver(Observer o); 
		
	/**
	 * Remove an observer
	 * @param o The observer to be removed
	 */
	public void removeObserver(Observer o);
/**
 * USed to notify observer of any state update
 */
	public void notifyObservers();
	
}
