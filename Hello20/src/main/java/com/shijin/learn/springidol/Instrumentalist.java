package com.shijin.learn.springidol;

public class Instrumentalist implements Instrumentalists {
  private String song;
  private Instrument instrument;

  public Instrumentalist() {

  }

  @Override
  public void perform() throws PerformanceException {
    System.out.println("Playing " + song + " : ");
    instrument.play();

  }

  @Override
  public String getSong() {
    return song;
  }

  @Override
  public void setSong(String song) {
    this.song = song;
  }

  @Override
  public Instrument getInstrument() {
    return instrument;
  }

  @Override
  public void setInstrument(Instrument instrument) {
    this.instrument = instrument;
  }

}
