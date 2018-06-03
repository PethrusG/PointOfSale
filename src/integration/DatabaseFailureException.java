/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

/**
 * Implementation of a Database Failure Exception
 * @author pethrus
 */
public class DatabaseFailureException extends Exception {
	
	/** 
	 * Constructs the DatabaseFailureException
	 */
	public DatabaseFailureException() {
		super("Database error.");
	}	
}
