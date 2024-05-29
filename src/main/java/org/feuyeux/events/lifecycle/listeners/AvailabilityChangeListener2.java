package org.feuyeux.events.lifecycle.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.ApplicationListener;

@Slf4j
public class AvailabilityChangeListener2
    implements ApplicationListener<AvailabilityChangeEvent<ReadinessState>> {
  @Override
  public void onApplicationEvent(AvailabilityChangeEvent<ReadinessState> event) {
    log.info("Handling AvailabilityChangeEvent {} {}", event.getTimestamp(), event.getState());
  }
}
