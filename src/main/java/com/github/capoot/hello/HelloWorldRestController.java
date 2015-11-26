package com.github.capoot.hello;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/hello")
public class HelloWorldRestController {

    private final HelloWorldService helloWorldService;

    @Inject
    public HelloWorldRestController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GET
    public String sayHello() {
        return helloWorldService.sayHello();
    }
}
