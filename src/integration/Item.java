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
 * Represents an item in the store. 
 */
public class Item {
	
    private int itemId;
    private double price;
    private String itemDescription;

    /**
     * Creates a new Item
     * @param itemId Identifies the item
     * @param price Price of the item
     * @param itemDescription Describes in human language what the item is
     */
    public Item(int itemId, int price, String itemDescription) {
		this.itemId = itemId;
		this.price = price;
		this.itemDescription = itemDescription;
    }

    /**
     * Retrieves the identifier of an item
     * @return The identifier of an item
     */
    public int getId() {
	    return itemId;
    }
	/** 
	 * Retrieves the human language description of the item
	 * @return Human language description of the item
	 */	
    public String getDescription() {
	    return itemDescription;
    }
   	/**
	 * Retrieves the price of the item
	 * @return The price of the item
	 */ 
    public double getPrice() {
	    return price;
    }
}
