package com.shijin.learn.aop;

import org.apache.logging.log4j.LogManager ;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shijin.learn.springidol.Instrumentalists;
import com.shijin.learn.springidol.Performer;

public class Main {
  private static final Logger logger = LogManager.getLogger(Main.class);
  public static void main(String[] args) {
    
    @SuppressWarnings("resource")
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    Instrumentalists kenny = (Instrumentalists) ctx.getBean("kenny");
    Instrumentalists carl = (Instrumentalists) ctx.getBean("carl");
    Performer juggler = (Performer) ctx.getBean("juggler");
    Performer kate = (Performer) ctx.getBean("kate");
    try {
      System.out.println();
      logger.info("Juggler will start the show!");
      juggler.perform();
      
      System.out.println();
      logger.info("Kate will start the show!");
      kate.perform();
      
      System.out.println();
      logger.info("Kenny will start the show!");
      kenny.perform();
      
      System.out.println();
      logger.info("Carl will start the show!");
      carl.perform();
    } catch (Exception e) {
      logger.error(e.getMessage());
    }

  }

}
