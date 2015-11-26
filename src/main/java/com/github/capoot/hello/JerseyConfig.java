package com.github.capoot.hello;

import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@Configuration
@ComponentScan(basePackages = {"com.github.capoot.hello"})
public class JerseyConfig extends ResourceConfig {

    private static final Logger LOG = LoggerFactory.getLogger(JerseyConfig.class);

    public JerseyConfig() {
        register(HelloWorldRestController.class);
    }

    @Bean
    public ServletContextListener listener() {
        return new ServletContextListener() {
            @Override
            public void contextInitialized(ServletContextEvent servletContextEvent) {
                LOG.info("application context is up");
            }
            @Override
            public void contextDestroyed(ServletContextEvent servletContextEvent) {
                LOG.info("application context is down");
            }
        };
    }
}
