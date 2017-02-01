package com.shijin.learn.Hello20;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	logger.debug("main start...");
        System.out.println( "Hello World!" );
        logger.debug("main completed!");
    }
}
