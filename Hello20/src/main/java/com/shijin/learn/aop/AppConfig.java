package com.shijin.learn.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.shijin.learn.springidol.Instrumentalist;
import com.shijin.learn.springidol.Piano;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="com.shijin.learn")
public class AppConfig {

  @Bean
  public Instrumentalist kenny() {
    Instrumentalist i = new Instrumentalist();
    i.setSong("Jingle Bells");
    i.setInstrument(new Piano());
    return i;
  }
  
  @Bean
  public Instrumentalist carl() {
    Instrumentalist i = new Instrumentalist();
    i.setSong(kenny().getSong().toUpperCase());
    i.setInstrument(piano());
    return i;
  }
  
  @Bean
  public Piano piano() {
    return new Piano();
  }
}
