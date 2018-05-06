/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import integration.Item;
import java.util.ArrayList;
/**
 *
 * @author pethrus
 * 
 * Represents all the items that the store contains.
 */
public class Inventory {
	
    private Item[] listOfItems;	

    /**
     * Creates a new inventory containing all the items in the store.
     * @param listOfItems The items in the store
     */
    public Inventory(Item[] listOfItems) {
        this.listOfItems = listOfItems;
    }
	/**
	 * Retrieves a specific item based on its id
	 * @param requestedId The identifier of the item
	 * @return The retrieved Item object.
	 */
    public Item getItem(int requestedId) {
		for (Item item : listOfItems) {
			if(item.getId() == requestedId)
				return item;
		}	    
		return null;
    }

    /**
     * Updates the inventory upon finalizing of a purchase, not implemented.
     * @param runningTotalLog A final representation of the current sale. 
     */
    public void updateInventory(RunningTotalLog runningTotalLog) {
	    // TODO: Update Inventory
    }
}
