package com.shijin.learn.springidol;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Auditorium {
  private static final Logger logger = LogManager.getLogger(Auditorium.class);
  
  public void turnOnLights() {
    System.out.println("Turn on lights!");
    logger.trace("lights on");
  }
  
  public void turnOffLights() {
    System.out.println("Turn off lights!");
    logger.trace("lights off");
  }
}
