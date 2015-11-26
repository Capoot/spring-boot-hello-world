package com.github.capoot.hello;

import javax.inject.Named;

@Named
public class HelloWorldService {

    public String sayHello() {
        return "Hello World!";
    }
}
