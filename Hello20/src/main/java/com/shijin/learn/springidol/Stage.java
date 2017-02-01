package com.shijin.learn.springidol;

public class Stage {
  private Stage() {}

  private static class StageSingletonHolder {
    static Stage instance = new Stage();
  }
  
  public static Stage getInstance() {
    return StageSingletonHolder.instance;
  }
  
  public void open() {
    System.out.println("Stage is ready");
  }
  
  public void close() {
    System.out.println("Stage is closed");
  }
}
