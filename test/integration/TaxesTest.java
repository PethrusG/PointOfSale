package integration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import integration.Taxes;

/**
 *
 * @author pethrus
 */
public class TaxesTest {
	private Taxes taxes;
	double currentTaxes;
	
	public TaxesTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
		taxes = new Taxes();
		currentTaxes = 1.25;
	}
	
	@After
	public void tearDown() {
	}

	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	// @Test
	// public void hello() {}
	@Test
	public void testAddTaxesToDoubleAmount() {
		double totalSoFar = 100;
		double expected = 100 * currentTaxes;
		assertEquals(expected, taxes.addTaxes(totalSoFar), 0.1);
	}

	@Test
	public void testAddTaxesToIntAmount() {
		int totalSoFar = 100;
		double expected = 100 * currentTaxes;
		assertEquals(expected, taxes.addTaxes(totalSoFar), 0.1);
	}
}
