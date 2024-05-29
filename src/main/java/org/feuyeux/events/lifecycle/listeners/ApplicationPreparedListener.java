package org.feuyeux.events.lifecycle.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class ApplicationPreparedListener implements ApplicationListener<ApplicationPreparedEvent> {
  @Override
  public void onApplicationEvent(ApplicationPreparedEvent event) {
    log.info("Handling ApplicationPreparedEvent {}",event.getTimestamp());
  }
}
