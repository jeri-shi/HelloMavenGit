package com.shijin.learn.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shijin.learn.springidol.Performer;

public class Main {
  private static final Logger logger = LogManager.getLogger(Main.class);
  public static void main(String[] args) {
    
    @SuppressWarnings("resource")
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    Performer kenny = (Performer) ctx.getBean("kenny");
    Performer carl = (Performer) ctx.getBean("carl");

    try {
      kenny.perform();
      carl.perform();
    } catch (Exception e) {
      logger.error(e.getMessage());
    }

  }

}
