/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

/**
 * Prints error messages to the user, e.g., the cashier, once an exception has been thrown.
 * @author pethrus
 */
public class ErrorMessageHandler {

/**
 * COnstructs the ErrorMessageHandler
 */	
	public ErrorMessageHandler() {
		
	}	
/**
 * Prints the error message to the console
 * @param msg Error message to be printed.
 */
	public void showErrorMessage(String msg) {
		//System.out.println("The String msg = " + msg);
		StringBuilder errorMsgBuilder = new StringBuilder();
		errorMsgBuilder.append("ERROR: ");
		errorMsgBuilder.append(msg);
		System.out.println(errorMsgBuilder);
	}
}
