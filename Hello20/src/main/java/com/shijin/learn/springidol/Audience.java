package com.shijin.learn.springidol;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

  @Pointcut("execution(* com.shijin.learn.springidol.Instrumentalists.perform(..))")
  public void performance() {
  }

  @Before("performance()")
  public void takeSeats() {
    System.out.println("The audience is taking their seats.");
  }

  @Before("performance())")
  public void turnOffCellPhones() {
    System.out.println("The audience is turning off their cellphones.");
  }

  @After("performance()")
  public void applaud() {
    System.out.println("CLAP CLAP CLAP CLAP CLAP CLAP CLAP CLAP");
  }

  @AfterThrowing("performance()")
  public void demandRefund() {
    System.out.println("Boo! We want our money back!");
  }

/*  @Pointcut("execution(* com.shijin.learn.springidol.Performer.perform(..))")
  public void perform() {
    
  }
  
  @Around("perform()")
  public void watchPerformance(ProceedingJoinPoint joinpoint) {
    try {
      System.out.println("The audience is waiting for the show...");
      System.out.println("The audience applause gently!");
      long start = System.currentTimeMillis();
      joinpoint.proceed();
      long end = System.currentTimeMillis();
      System.out.println("The audience is pleased!");
      System.out.println("The performance took " + (end-start) + " millisenconds.");
    } catch (Throwable t) {
      System.out.println("Boo! want our money back!!!");
    }
  }*/
}
