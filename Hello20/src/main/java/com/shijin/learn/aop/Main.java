package com.shijin.learn.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shijin.learn.springidol.Instrumentalists;
import com.shijin.learn.springidol.Performer;
import com.shijin.learn.springidol.para.Contestant;
import com.shijin.learn.springidol.para.MindReader;
import com.shijin.learn.springidol.para.Thinker;

public class Main {
  private static final Logger logger = LogManager.getLogger(Main.class);
  private static ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

  public static void main(String[] args) {
    scenario3();

  }

  /**
   * AOP introduction example
   */
  public static void scenario3() {
    Performer juggler = (Performer) ctx.getBean("juggler");
    Performer kate = (Performer) ctx.getBean("kate");
    try {
      System.out.println();
      logger.info("Juggler will start the show!");
      juggler.perform();
      ((Contestant)juggler).receiveAward();

      System.out.println();
      logger.info("Kate will start the show!");
      kate.perform();
      ((Contestant)kate).receiveAward();

    } catch (Exception e) {
      logger.error(e.getMessage());
    }


  }


  public static void scenario2() {
    MindReader magician = (MindReader) ctx.getBean("magician");
    Thinker volunteer = (Thinker) ctx.getBean("volunteer");

    logger.info("volunteer start thinking...");
    volunteer.thinkOfSomething("I am happy now!");
    System.out.println("magician said: the thought is " + magician.getThoughts());
    System.out.println("voluneer said: the thought was " + volunteer.getThoughts());

    logger.info("volunteer start thinking again...");
    volunteer.thinkOfSomething("I am curious now!!!");
    System.out.println("magician said: the thought is " + magician.getThoughts());
    System.out.println("voluneer said: the thought was " + volunteer.getThoughts());

  }

  public static void scenario1() {
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
