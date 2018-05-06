/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import java.util.ArrayList;
import integration.Item;

/**
 *
 * @author pethrus
 * 
 * Contains the list of all items currently in the shopping basket of the customer.
 * Needed when the final sale needs to be logged.
 */
public class ListOfCurrentItems {
	
	private ArrayList<Item> listOfCurrentItems;

	/**
	 * Creates new empty list of ListOfCurrentItems
	 */
	public ListOfCurrentItems() {
		listOfCurrentItems = new ArrayList<Item>();
	}
	
	/**
	 * Adds items to a ListOfCurrentItems.
	 * @param item Item to be added
	 * @param amount Number of items to be added
	 * @return 
	 */
	public ArrayList<Item> addItem(Item item, int amount) {
		for(int i = 0; i < amount; i++) {
			listOfCurrentItems.add(item);
		}
			return listOfCurrentItems;
	}

	/**
	 * Returns the ArrayList that contains the current items in the shopping basket.
	 * @return An ArrayList<Item> with items added so far by the customer.
	 */
	public ArrayList<Item> getListOfCurrentItems() {
		return listOfCurrentItems;
	}
}
