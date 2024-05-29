# Hello lifecycle

```sh
mvn test
```

```sh
14:50:44.986 listeners.ApplicationEnvironmentPreparedListener Handling ApplicationEnvironmentPreparedEvent 1716965444749
14:50:45.047 listeners.ApplicationContextInitializedListener Handling ApplicationContextInitializedEvent 1716965445046
14:50:45.048 lifecycle.HelloLifecycleApplication Starting HelloLifecycleApplication using Java ...
14:50:45.098 listeners.ApplicationPreparedListener Handling ApplicationPreparedEvent 1716965445096
14:50:45.848 tomcat.TomcatWebServer Tomcat initialized with port 9876 (http)
14:50:45.915 context.ServletWebServerApplicationContext Root WebApplicationContext: initialization completed in 814 ms
14:50:46.240 tomcat.TomcatWebServer Tomcat started on port 9876 (http) with context path '/'
14:50:46.241 listeners.WebServerInitializedListener Handling WebServerInitializedEvent 1716965446240
14:50:46.246 listeners.ContextRefreshedListener Handling ContextRefreshedEvent 1716965446241
14:50:46.248 lifecycle.HelloLifecycleApplication Started HelloLifecycleApplication in 1.609 seconds (process running for 2.766)
14:50:46.249 listeners.ApplicationStartedListener Handling ApplicationStartedEvent 1716965446249
14:50:46.250 listeners.AvailabilityChangeListener Handling AvailabilityChangeEvent 1716965446249
14:50:46.251 listeners.ApplicationReadyListener Handling ApplicationReadyEvent 1716965446251
14:50:46.251 listeners.AvailabilityChangeListener Handling AvailabilityChangeEvent 1716965446251
```

1. `ApplicationStartingEvent`: An ApplicationStartingEvent is fired at the start of a run but before any processing, except for the registration of listeners and initializers.
1. `ApplicationEnvironmentPreparedEvent`: An ApplicationEnvironmentPreparedEvent is fired when the Environment to be used in the context is available. Since the Environment will be ready at this point, we can inspect and do modify it before it’s used by other beans.
1. `ApplicationContextInitializedEvent`: An ApplicationContextInitializedEvent is fired when the ApplicationContext is ready and ApplicationContextInitializers are called but bean definitions are not yet loaded.  We can use this to perform a task before beans are initialized into Spring container.
1. `ApplicationPreparedEvent`: An ApplicationPreparedEvent is fired when ApllicationContext is prepared but not refreshed. The Environment is ready for use and bean definitions will be loaded.
1. `WebServerInitializedEvent`: If we’re using a web server, a WebServerInitializedEvent is fired after the web server is ready. ServletWebServerInitializedEvent and ReactiveWebServerInitializedEvent are the servlet and reactive variants, respectively.  The WebServerInitializedEvent does not extend SpringApplicationEvent.
1. `ContextRefreshedEvent`: A ContextRefreshedEvent is fired when an ApplicationContext is refreshed. The ContextRefreshedEvent comes from Spring directly and not from Spring Boot and does not extend SpringApplicationEvent.
1. `ApplicationStartedEvent`: An ApplicationStartedEvent is fired after the context has been refreshed but before any application and command-line runners have been called.
1. `ApplicationReadyEvent`: An ApplicationReadyEvent is fired to indicate that the application is ready to service requests. It is advised not to modify the internal state at this point since all initialization steps will be completed.
1. `ApplicationFailedEvent`: An ApplicationFailedEvent is fired if there is an exception and the application fails to start. This can happen at any time during startup. We can use this to perform some tasks like execute a script or notify on startup failure.