package com.shijin.learn.springidol;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PoeticJuggler extends Juggler {
  private static final Logger logger = LogManager.getLogger(PoeticJuggler.class);
  private Poem poem;

  public PoeticJuggler(Poem poem) {
    super();
    this.poem = poem;
  }

  public PoeticJuggler(int beanBags, Poem poem) {
    super(beanBags);
    logger.debug("Init beanBags = " + beanBags);
    this.poem = poem;
  }

  @Override
  public void perform() throws PerformanceException {
    super.perform();
    System.out.println("While reciting...");
    poem.recite();
  }


}
