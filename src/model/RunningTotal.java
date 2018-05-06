/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import integration.ListOfCurrentItems;
import integration.Inventory;
import integration.Item;
import integration.RunningTotalPresentation;

/**
 *
 * @author pethrus
 * 
 * Handles most things that happens during the sale apart such as registering
 * items. When the Customer wants to end the sale, CloseSale takes over.
 */
public class RunningTotal {

    private Inventory inventory;
    private ListOfCurrentItems listOfCurrentItems;
    private RunningTotalPresentation currentRunningTotalPresentation;
    private double totalSoFar;
		/**
		 * Creates RunningTotal which in turns creates an Inventory, 
		 * ListOfCurrentItems and a reference to the static RunningTotalPresentation
		 * used as a DTO when needed.
		 */
    public RunningTotal() {
		Item[] itemList = createItemList();
		this.inventory = new Inventory(itemList);
		this.listOfCurrentItems = new ListOfCurrentItems();
		// this.currentItem = new Item();
		this.totalSoFar = 0;
		this.currentRunningTotalPresentation =
			new RunningTotalPresentation("", 0, 0);
    }
	/**
	 * Registers one or more items that the customer buys by checking the 
	 * Inventory to see what item it is and updates totalSoFar
	 * as well as listOfCurrentItems.
	 * @param itemId Identifier of the item
	 * @param amount Number of items of the same kind.
	 * @return 
	 */
    public RunningTotalPresentation registerItem(int itemId, int amount) {
	    Item retrievedItem = inventory.getItem(itemId);
		if (retrievedItem != null) {
			updateTotalSoFar(retrievedItem.getPrice(), amount);
			updateListOfCurrentItems(retrievedItem, amount);
				return new RunningTotalPresentation(retrievedItem.getDescription(),
					retrievedItem.getPrice(), totalSoFar);		
		}
		else {
				return new RunningTotalPresentation("No such item found", 0, totalSoFar);
		}
    }
	/**
	 * Returns totalSoFar.
	 * @return 
	 */
    public double getTotalSoFar() {
	    return totalSoFar;
    }
	/**
	 * Returns listOfCurrentItems
	 * @return 
	 */
    public ListOfCurrentItems getListOfCurrentItems() {
	    return listOfCurrentItems;
    }
	/** 
	 * Returns inventory
	 * @return 
	 */
    public Inventory getInventory() {
	    return inventory;
    }

    /**
     * Sets a new totalSoFar. Used by Taxes and Discount.
     * @param totalSoFar  The new total so far.
     */
    public void setNewTotalSoFar(double totalSoFar) {
		this.totalSoFar = totalSoFar;    
    }
    
    private void updateTotalSoFar(double price, int amount) {
	    for (int i = 0; i < amount; i++) {
		    totalSoFar += price;
	    }
    }

    private void updateTotalSoFar(double price) {
	    totalSoFar += price;
    }


    private void updateListOfCurrentItems(Item item, int amount) {
		listOfCurrentItems.addItem(item, amount);
    }

    private Item[] createItemList() {
	    Item kalaspuffar = new Item(77, 25, "Kalaspuffar");
		Item choklad = new Item(95, 15, "Choklad");
		Item juice = new Item(107, 10, "Juice");
		Item[] itemList = {kalaspuffar, choklad, juice};
		return itemList;
    }
}

