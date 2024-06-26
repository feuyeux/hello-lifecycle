package org.feuyeux.events.lifecycle.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.context.ApplicationListener;

@Slf4j
public class AvailabilityChangeListener
    implements ApplicationListener<AvailabilityChangeEvent<LivenessState>> {
  @Override
  public void onApplicationEvent(AvailabilityChangeEvent<LivenessState> event) {
    log.info("Handling AvailabilityChangeEvent {} {}", event.getTimestamp(), event.getState());
  }
}
