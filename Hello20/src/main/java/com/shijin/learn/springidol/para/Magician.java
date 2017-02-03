package com.shijin.learn.springidol.para;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Magician implements MindReader {
  private String thoughts;

  @Override
  @Before("thinking(String) && args(thoughts)")
  public void interceptThoughts(String thoughts) {
    System.out.println("Intercepting volunteer's thoughts");
    this.thoughts = thoughts;

  }

  @Override
  public String getThoughts() {
    return thoughts;
  }
  
  @Pointcut("execution(* com.shijin.learn.springidol.para.Thinker.thinkOfSomething(String)) && args(thoughts)")
  public void thinking(String thoughts) {
    
  }

}
