package org.feuyeux.events.lifecycle.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class ApplicationFailedListener implements ApplicationListener<ApplicationFailedEvent> {
  @Override
  public void onApplicationEvent(ApplicationFailedEvent event) {
    log.info("Handling ApplicationFailedEvent {}", event.getTimestamp());
  }
}
