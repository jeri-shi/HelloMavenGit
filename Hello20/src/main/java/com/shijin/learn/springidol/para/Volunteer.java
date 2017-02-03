package com.shijin.learn.springidol.para;

public class Volunteer implements Thinker {
  private String thoughts;
  
  @Override
  public void thinkOfSomething(String thoughts) {
    this.thoughts = thoughts;
  }
  
  @Override
  public String getThoughts() {
    return thoughts;
  }

}
