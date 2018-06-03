/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

/**
 * Is thrown if an item requested is not found in the Inventory
 * @author pethrus
 */
public class NoSuchItemException extends Exception {

	private int itemNotFoundID;
/**
 * Constructs the NoSuchItemException
 * @param itemNotFoundID  ID of the item not found
 */
	public NoSuchItemException(int itemNotFoundID) {
		super("The item with id: " + itemNotFoundID + " could not be found in the inventory.");	
			this.itemNotFoundID = itemNotFoundID;
	}

	/** 
	 * Retrieves the Item that was not found.
	 * @return The item not found
	 */
	public int getItem() {
		return itemNotFoundID;
	}

		
}
