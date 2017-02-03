package com.shijin.learn.springidol;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrument {

  @Override
  public void play() {
    System.out.println("PLINK PLINK PLINK");

  }

}
