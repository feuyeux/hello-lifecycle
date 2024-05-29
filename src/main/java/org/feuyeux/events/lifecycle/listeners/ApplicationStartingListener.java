package org.feuyeux.events.lifecycle.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class ApplicationStartingListener implements ApplicationListener<ApplicationStartingEvent> {
  @Override
  public void onApplicationEvent(ApplicationStartingEvent event) {
    log.info("Handling ApplicationStartingEvent {}", event.getTimestamp());
  }
}
