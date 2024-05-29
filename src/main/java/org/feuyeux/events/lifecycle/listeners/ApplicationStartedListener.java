package org.feuyeux.events.lifecycle.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class ApplicationStartedListener implements ApplicationListener<ApplicationStartedEvent> {
  @Override
  public void onApplicationEvent(ApplicationStartedEvent event) {
    log.info("Handling ApplicationStartedEvent {}",event.getTimestamp());
  }
}
