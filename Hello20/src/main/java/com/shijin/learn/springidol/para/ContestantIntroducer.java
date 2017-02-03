package com.shijin.learn.springidol.para;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class ContestantIntroducer {
  
  @DeclareParents(value="com.shijin.learn.springidol.Performer+", defaultImpl=GraciousContestant.class)
  public static Contestant contestant;
}
