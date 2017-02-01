package com.shijin.learn.springidol;

import java.util.Properties;

public class OneManBand implements Performer {

  private Properties instruments;

  public OneManBand() {

  }

  @Override
  public void perform() throws PerformanceException {
    for(Object key : instruments.keySet()) {
      System.out.print(key + " : ");
      System.out.println(instruments.get(key));
    }
//    for (Instrument instrument : instruments) {
//      instrument.play();
//    }
  }

  public void setInstruments(Properties instruments) {
    this.instruments = instruments;
  }

}
