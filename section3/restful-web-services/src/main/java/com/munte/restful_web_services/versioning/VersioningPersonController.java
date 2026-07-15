package com.munte.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class VersioningPersonController {

//    URI versioning - Twitter
    @GetMapping("/v1")
    public PersonV1 getFirstVersionOfPerson() {
        return new PersonV1("v1 Bob Charlie");
    }

    @GetMapping("/v2")
    public PersonV2 getSecondVersionOfPerson() {
        return new PersonV2(new Name("v2 Bob", "Charlie"));
    }

//    Request Parameter versioning - Amazon
    @GetMapping(params = "version=1")
    public PersonV1 getFirstVersionOfPerson_RequestParameter() {
        return new PersonV1("v1 Bob Charlie - params");
    }

    @GetMapping(params = "version=2")
    public PersonV2 getSecondVersionOfPerson_RequestParameter() {
        return new PersonV2(new Name("v2 Bob - params", "Charlie - params"));
    }

//    Custom headers versioning - Microsoft
    @GetMapping(headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPerson_RequestHeader() {
        return new PersonV1("v1 Bob Charlie - headers");
    }

    @GetMapping(headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPerson_RequestHeader() {
        return new PersonV2(new Name("v2 Bob - params", "Charlie - header"));
    }

//    Media type versioning (a.k.a "content negotiation" or "accept header") - Github
    @GetMapping(produces = "application/vnd.company.app-v1+json")
    public PersonV1 getFirstVersionOfPerson_RequestMediaType() {
        return new PersonV1("v1 Bob Charlie - media type");
    }

    @GetMapping(produces = "application/vnd.comp-v2+json")
    public PersonV2 getSecondVersionOfPerson_RequestMediaType() {
        return new PersonV2(new Name("v2 Bob - params", "Charlie - media type"));
    }

}
