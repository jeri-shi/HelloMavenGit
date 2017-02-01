package com.shijin.learn.springidol;

public class Sonnet29 implements Poem {
  private static String[] LINES = {
      "When, someone is looking for a journey through their eyes,",
      "And look upon myself and curse my fate,"
  };
  
  public Sonnet29() {
  }
  
  @Override
  public void recite() {
    for (int i = 0; i < LINES.length; i++) {
      System.out.println(LINES[i]);
    }

  }

}
