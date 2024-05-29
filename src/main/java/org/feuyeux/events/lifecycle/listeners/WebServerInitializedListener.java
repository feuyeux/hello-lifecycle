package org.feuyeux.events.lifecycle.listeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class WebServerInitializedListener
    implements ApplicationListener<WebServerInitializedEvent> {

  @Override
  public void onApplicationEvent(WebServerInitializedEvent event) {
    log.info("Handling WebServerInitializedEvent {}",event.getTimestamp());
  }
}
