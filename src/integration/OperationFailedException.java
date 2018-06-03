/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

/**
 * A somewhat genereic exception used to incorporate exceptions thrown by lower layers
 * deemed too technical to the View layer
 * @author pethrus
 */
public class OperationFailedException extends Exception {
		
	/**
	 * Constructs the new exception and includes the old one.
	 * @param msg Any additional message.
	 * @param cause The old exception
	 */
	public OperationFailedException(String msg, Exception cause) {
		super(msg, cause);
	}
}
