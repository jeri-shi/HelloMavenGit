package com.shijin.learn.springidol;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Juggler implements Performer {
  private static final Logger logger = LogManager.getLogger(Performer.class);

  private int beanBags = 3;

  public Juggler() {}

  public Juggler(int beanBags) {
    this.beanBags = beanBags;
  }

  @Override
  public void perform() throws PerformanceException {
    logger.debug("performer start...");
    System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    logger.debug("performer finished...");
  }

  public static void main(String[] args) {
    logger.info("main start...");
    
    @SuppressWarnings("resource")
    ApplicationContext ctx =
        new ClassPathXmlApplicationContext("com/shijin/learn/springidol/spring-idol.xml");

    try{
//      Stage theStage = (Stage) ctx.getBean("theStage");
//      theStage.open();
      
      Performer performer = (Performer) ctx.getBean("hank");
      performer.perform();
      
//      performer = (Performer) ctx.getBean("tom");
//      performer.perform();
      
//      theStage.close();
    }catch(Exception e){
      logger.error(e.getMessage());
    }

    
    logger.info("main end.");

  }

}
