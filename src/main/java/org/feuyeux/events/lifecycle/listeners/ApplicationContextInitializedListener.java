package org.feuyeux.events.lifecycle.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class ApplicationContextInitializedListener
    implements ApplicationListener<ApplicationContextInitializedEvent> {
  @Override
  public void onApplicationEvent(ApplicationContextInitializedEvent event) {
    log.info("Handling ApplicationContextInitializedEvent {}", event.getTimestamp());
  }
}
