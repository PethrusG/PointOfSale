/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import integration.Item;
import java.util.ArrayList;
import integration.Constants.*;
import static integration.Constants.DBEXCEPTION;
/**
 *
 * @author pethrus
 * 
 * Represents all the items that the store contains.
 */
public class Inventory {
	
	/**
	 * Stores the one and only instance of this Singleton class
	 */
	private static final Inventory INVENTORY = new Inventory();
    private Item[] listOfItems;	
    // private final int DBEXCEPTION = 13;

    /**
     * Creates a new inventory containing all the items in the store.
	 * Is private since this is a Singleton class
     * @param listOfItems The items in the store
     */
    private Inventory() {
        this.listOfItems = createItemList();
    }
/**
 * Retrieves the one and only instance of this Singleton class
 * @return  The one and only instance of Inventory
 */
	public static Inventory getInventory() {
		return INVENTORY;
	}
	/**
	 * Retrieves a specific item based on its id
	 * @param requestedId The identifier of the item
	 * @return The retrieved Item object.
	 * @throws integration.NoSuchItemException
	 */
    public Item getItem(int requestedId) throws NoSuchItemException, 
			DatabaseFailureException {
		
		if(requestedId == DBEXCEPTION)
			throw new DatabaseFailureException();
		for (Item item : listOfItems) {
			if(item.getId() == requestedId)
				return item;
		}	    
		throw new NoSuchItemException(requestedId);
    }

    /**
     * Updates the inventory upon finalizing of a purchase, not implemented.
     * @param runningTotalLog A final representation of the current sale. 
     */
    public void updateInventory(RunningTotalLog runningTotalLog) {
	    // TODO: Update Inventory
    }

    private Item[] createItemList() {
	    Item kalaspuffar = new Item(77, 25, "Kalaspuffar");
		Item choklad = new Item(95, 15, "Choklad");
		Item juice = new Item(107, 10, "Juice");
		Item[] itemList = {kalaspuffar, choklad, juice};
		return itemList;
    }
}
