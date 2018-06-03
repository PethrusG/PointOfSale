/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Used to print error messages used by developers and administrators to a error log file.
 * @author pethrus
 */
public class LogHandler {
	
	// private static final String LOG_FILE_NAME = "point-of-sale-log.txt";
	private PrintWriter logFile;
/**
 * Creates the LogHandler
 * @throws IOException in case something is wrong with the IO
 */	
	public LogHandler() throws IOException {
		FileWriter file = new FileWriter("/home/pethrus/Desktop/point-of-sale-log.txt");
		logFile = new PrintWriter(file, true);
	}	
/**
 * Logs the exception into the error log file
 * @param exc Exception to be logged into the error log file
 */
	public void logException(Exception exc) {
		StringBuilder logMsgBuilder = new StringBuilder();
		logMsgBuilder.append("\n");
		logMsgBuilder.append("Exception was thrown: ");
		logMsgBuilder.append(exc.getMessage());
		logMsgBuilder.append("\n");
		logFile.println(logMsgBuilder);
		exc.printStackTrace(logFile);
	}
}
