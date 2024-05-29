package org.feuyeux.events.lifecycle.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class AvailabilityChangeListener implements ApplicationListener<AvailabilityChangeEvent> {
  @Override
  public void onApplicationEvent(AvailabilityChangeEvent event) {
    log.info("Handling AvailabilityChangeEvent {}",event.getTimestamp());
  }
}
