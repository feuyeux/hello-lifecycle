package org.feuyeux.events.lifecycle;

import lombok.extern.slf4j.Slf4j;
import org.feuyeux.events.lifecycle.listeners.*;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class HelloLifecycleApplication {
  public static void main(String[] args) {
    SpringApplication springApplication = new SpringApplication(HelloLifecycleApplication.class);
    springApplication.addListeners(new ApplicationEnvironmentPreparedListener());
    springApplication.addListeners(new ApplicationContextInitializedListener());
    springApplication.addListeners(new ApplicationFailedListener());
    springApplication.addListeners(new ApplicationPreparedListener());
    springApplication.addListeners(new ApplicationReadyListener());
    springApplication.addListeners(new ApplicationStartedListener());
    springApplication.addListeners(new ApplicationStartingListener());
    springApplication.addListeners(new AvailabilityChangeListener());
    springApplication.addListeners(new AvailabilityChangeListener2());
    springApplication.addListeners(new ContextRefreshedListener());
    springApplication.addListeners(new WebServerInitializedListener());
    springApplication.setBannerMode(Banner.Mode.OFF);
    springApplication.run(args);
  }
}
