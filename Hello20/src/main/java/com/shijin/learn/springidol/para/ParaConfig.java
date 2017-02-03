package com.shijin.learn.springidol.para;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParaConfig {

  @Bean
  public Magician magician() {
    return new Magician();
  }
  
  @Bean
  public Volunteer volunteer() {
    return new Volunteer();
  }
}
