package com.shijin.learn.aop;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.shijin.learn.springidol.Audience;
import com.shijin.learn.springidol.Cymbal;
import com.shijin.learn.springidol.Guitar;
import com.shijin.learn.springidol.Harmonica;
import com.shijin.learn.springidol.Instrument;
import com.shijin.learn.springidol.Instrumentalist;
import com.shijin.learn.springidol.Instrumentalists;
import com.shijin.learn.springidol.OneManBand;
import com.shijin.learn.springidol.Performer;
import com.shijin.learn.springidol.Piano;
import com.shijin.learn.springidol.PoeticJuggler;
import com.shijin.learn.springidol.Sonnet29;
import com.shijin.learn.springidol.para.ParaConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="com.shijin.learn.springidol")
@Import(ParaConfig.class)
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
  public Performer juggler() {
    return new PoeticJuggler(new Sonnet29());
  }

  @Bean
  public Guitar guitar() {
    return new Guitar();
  }
  
  @Bean
  public Cymbal cymbal() {
    return new Cymbal();
  }
  
  @Bean
  public Harmonica harmonica() {
    return new Harmonica();
  }
  
  @Bean
  public Collection<Instrument> instruments() {
    Collection<Instrument> list = new ArrayList<Instrument>();
    list.add(guitar());
    list.add(cymbal());
    list.add(harmonica());
    list.add(piano());
    return list;
  }
  
  @Bean
  public Performer kate() {
    OneManBand kate = new OneManBand();
    kate.setInstruments(instruments());
    return kate;
  }

}
