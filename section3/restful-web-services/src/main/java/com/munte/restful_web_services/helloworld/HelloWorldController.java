package com.munte.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping()
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World!");
    }

    @GetMapping("/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable(name = "name") String pathVariable) {
        return new HelloWorldBean("Hello " + pathVariable + "!");
    }

}

