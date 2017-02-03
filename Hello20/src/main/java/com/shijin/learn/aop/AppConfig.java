package com.shijin.learn.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

import com.shijin.learn.springidol.Audience;
import com.shijin.learn.springidol.Instrumentalist;
import com.shijin.learn.springidol.Instrumentalists;
import com.shijin.learn.springidol.Piano;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="com.shijin.learn.springidol")
public class AppConfig {
//  private static final Logger logger = LogManager.getLogger(AppConfig.class);
  
  @Bean
  public Audience audience() {
    return new Audience();
  }
  
  @Bean
  public Piano piano() {
    return new Piano();
  }

  @Bean
  public Instrumentalists kenny() {
    Instrumentalists kenny = new Instrumentalist();
    kenny.setSong("Jingle Bells");
    kenny.setInstrument(piano());
    return kenny;
  }
  
  @Bean
  public Instrumentalists carl() {
    Instrumentalists carl = new Instrumentalist();
    carl.setSong(kenny().getSong().toUpperCase());
    carl.setInstrument(piano());
    return carl;
  }
  
  @Bean
  @Scope("prototype")
  public Instrumentalists instrumentalist() {
    return new Instrumentalist();
  }
  
}
