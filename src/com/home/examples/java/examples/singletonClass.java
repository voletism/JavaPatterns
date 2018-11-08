package com.home.examples.java.examples;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Assert;

public class singletonClass {
	
	private static singletonClass instance = null;
	
	public static singletonClass getInstance() {
		
		if (instance == null) {
			instance = new singletonClass();
		}
		return instance;
	}
	
	public static void main(String [] args) {
		
		Logger mylogger = Logger.getLogger("global");
		
		singletonClass oneInstance = singletonClass.getInstance();
		
		mylogger.log(Level.INFO, "firstInstance");
		mylogger.info(""+ oneInstance);
		singletonClass twoInstance = singletonClass.getInstance();
		mylogger.log(Level.INFO, "secondInstance");
		mylogger.info(" " + twoInstance);
		Assert.assertEquals(oneInstance, twoInstance);
	}

}
