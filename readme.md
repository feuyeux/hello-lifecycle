# Hello lifecycle

```sh
mvn test
```

```sh
2024-05-29T11:53:58.273+08:00  INFO 4450 --- [hello-lifecycle] [           main] .l.ApplicationContextInitializedListener : Handling ApplicationContextInitializedEvent 1716954838272
2024-05-29T11:53:58.282+08:00  INFO 4450 --- [hello-lifecycle] [           main] o.f.e.l.HelloLifecycleApplication        : Starting HelloLifecycleApplication using ...
2024-05-29T11:53:58.364+08:00  INFO 4450 --- [hello-lifecycle] [           main] o.f.e.l.l.ApplicationPreparedListener    : Handling ApplicationPreparedEvent 1716954838361
2024-05-29T11:53:59.516+08:00  INFO 4450 --- [hello-lifecycle] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 9876 (http)
2024-05-29T11:53:59.536+08:00  INFO 4450 --- [hello-lifecycle] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-05-29T11:53:59.536+08:00  INFO 4450 --- [hello-lifecycle] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.24]
2024-05-29T11:53:59.599+08:00  INFO 4450 --- [hello-lifecycle] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-05-29T11:53:59.601+08:00  INFO 4450 --- [hello-lifecycle] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1235 ms
2024-05-29T11:54:00.031+08:00  INFO 4450 --- [hello-lifecycle] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 9876 (http) with context path '/'
2024-05-29T11:54:00.033+08:00  INFO 4450 --- [hello-lifecycle] [           main] o.f.e.l.l.WebServerInitializedListener   : Handling WebServerInitializedEvent 1716954840031
2024-05-29T11:54:00.040+08:00  INFO 4450 --- [hello-lifecycle] [           main] o.f.e.l.l.ContextRefreshedListener       : Handling ContextRefreshedEvent 1716954840033
2024-05-29T11:54:00.042+08:00  INFO 4450 --- [hello-lifecycle] [           main] o.f.e.l.HelloLifecycleApplication        : Started HelloLifecycleApplication in 2.399 seconds (process running for 2.852)
2024-05-29T11:54:00.043+08:00  INFO 4450 --- [hello-lifecycle] [           main] o.f.e.l.l.ApplicationStartedListener     : Handling ApplicationStartedEvent 1716954840043
2024-05-29T11:54:00.044+08:00  INFO 4450 --- [hello-lifecycle] [           main] o.f.e.l.l.AvailabilityChangeListener     : Handling AvailabilityChangeEvent 1716954840043
2024-05-29T11:54:00.046+08:00  INFO 4450 --- [hello-lifecycle] [           main] o.f.e.l.l.ApplicationReadyListener       : Handling ApplicationReadyEvent 1716954840046
2024-05-29T11:54:00.047+08:00  INFO 4450 --- [hello-lifecycle] [           main] o.f.e.l.l.AvailabilityChangeListener     : Handling AvailabilityChangeEvent 1716954840047
```

1. `ApplicationStartingEvent`: An ApplicationStartingEvent is fired at the start of a run but before any processing, except for the registration of listeners and initializers.
1. `ApplicationEnvironmentPreparedEvent`: An ApplicationEnvironmentPreparedEvent is fired when the Environment to be used in the context is available. Since the Environment will be ready at this point, we can inspect and do modify it before it’s used by other beans.
1. `ApplicationContextInitializedEvent`: An ApplicationContextInitializedEvent is fired when the ApplicationContext is ready and ApplicationContextInitializers are called but bean definitions are not yet loaded.  We can use this to perform a task before beans are initialized into Spring container.
1. `ApplicationPreparedEvent`: An ApplicationPreparedEvent is fired when ApllicationContext is prepared but not refreshed. The Environment is ready for use and bean definitions will be loaded.
1. `ContextRefreshedEvent`: A ContextRefreshedEvent is fired when an ApplicationContext is refreshed. The ContextRefreshedEvent comes from Spring directly and not from Spring Boot and does not extend SpringApplicationEvent.
1. `WebServerInitializedEvent`: If we’re using a web server, a WebServerInitializedEvent is fired after the web server is ready. ServletWebServerInitializedEvent and ReactiveWebServerInitializedEvent are the servlet and reactive variants, respectively.  The WebServerInitializedEvent does not extend SpringApplicationEvent.
1. `ApplicationStartedEvent`: An ApplicationStartedEvent is fired after the context has been refreshed but before any application and command-line runners have been called.
1. `ApplicationReadyEvent`: An ApplicationReadyEvent is fired to indicate that the application is ready to service requests. It is advised not to modify the internal state at this point since all initialization steps will be completed.
1. `ApplicationFailedEvent`: An ApplicationFailedEvent is fired if there is an exception and the application fails to start. This can happen at any time during startup. We can use this to perform some tasks like execute a script or notify on startup failure.