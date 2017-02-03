package com.shijin.learn.springidol;

public interface Instrumentalists{
  String getSong();

  void setSong(String song);

  Instrument getInstrument();

  void setInstrument(Instrument instrument);

  void perform() throws PerformanceException;
}
