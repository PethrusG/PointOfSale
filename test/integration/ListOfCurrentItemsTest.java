/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pethrus
 */
public class ListOfCurrentItemsTest {
	private static final int ITEMS = 10;
	private Item[] itemList;
	private ListOfCurrentItems listOfCurrentItems;
	
	public ListOfCurrentItemsTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	@SuppressWarnings("empty-statement")
	public void setUp() {
	    Item kalaspuffar = new Item(77, 25, "Kalaspuffar");
		Item choklad = new Item(95, 15, "Choklad");
		Item juice = new Item(107, 10, "Juice");
		itemList = new Item[ITEMS];
		itemList[0] = kalaspuffar;
		itemList[1] = choklad;
	}
	
	@After
	public void tearDown() {
	}

	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	// @Test
	// public void hello() {}

	// TEST that an empty arraylist is created upon initialization
	// TEST that it actually adds one item
	// TEST that it can add more than one item.
	@Test
	public void testCreatingEmptyListOfCurentItems () {
		listOfCurrentItems = new ListOfCurrentItems();
		assertEquals("Empty ArrayList created", 0, 
			listOfCurrentItems.getListOfCurrentItems().size());
	}
	
	@Test
	public void testCreatingAndAddingAnItemToTheList() {
		listOfCurrentItems = new ListOfCurrentItems();
		listOfCurrentItems.addItem(itemList[0], 1);
		assertEquals("ArrayList with one item added", itemList[0], 
			listOfCurrentItems.getListOfCurrentItems().get(0));
		System.out.println("itemList[0]:" + itemList[0]);
	}

	public void testCreatingAndAddingMoreItemsToTheList() {
		listOfCurrentItems = new ListOfCurrentItems();
		listOfCurrentItems.addItem(itemList[0], 1);
		listOfCurrentItems.addItem(itemList[1], 1);
		listOfCurrentItems.addItem(itemList[2], 1);
		assertEquals("ArrayList with one item added", itemList[0], 
			listOfCurrentItems.getListOfCurrentItems().get(0));
		assertEquals("ArrayList with one item added", itemList[1], 
			listOfCurrentItems.getListOfCurrentItems().get(1));
		assertEquals("ArrayList with one item added", itemList[2], 
			listOfCurrentItems.getListOfCurrentItems().get(2));
	}
	@Test
	public void testAddingSeveralOfTheSameItemsToTheList() {
		listOfCurrentItems = new ListOfCurrentItems();
		listOfCurrentItems.addItem(itemList[0], 3);
		assertEquals("ArrayList with one item added", itemList[0], 
			listOfCurrentItems.getListOfCurrentItems().get(0));
		assertEquals("ArrayList with one item added", itemList[0], 
			listOfCurrentItems.getListOfCurrentItems().get(1));
		assertEquals("ArrayList with one item added", itemList[0], 
			listOfCurrentItems.getListOfCurrentItems().get(2));
		
	}
}
