/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startup;

import controller.Controller;
import model.RunningTotal;
import view.View;
import integration.Item;
import integration.Customer;
import java.io.IOException;
/**
 *
 * @author pethrus
 * 
 * Responsible for starting up the program
 */
public class Main {

    /**
     * Creates the classes needed to start executing the program, then hands over
     * completely to the View.
     * @param args the command line arguments, not used here.
     */
    public static void main(String[] args) throws InterruptedException, IOException {
		RunningTotal runningTotal = new RunningTotal();
		Controller controller = new Controller(runningTotal);
		Customer customer = new Customer(1);
		new View(controller, customer).sampleExecution();
    }
}
