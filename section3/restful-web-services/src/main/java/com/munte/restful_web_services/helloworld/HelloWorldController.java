package com.munte.restful_web_services.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    private final MessageSource messageSource;

    @Autowired
    public HelloWorldController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

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

    @GetMapping("/internationalized")
    public String goodMorningInternationalized() {
        Locale locale = LocaleContextHolder.getLocale(); // get the location of the user from the headers

        return messageSource.getMessage("good.morning.message", null, "default message", locale);

    }

}

