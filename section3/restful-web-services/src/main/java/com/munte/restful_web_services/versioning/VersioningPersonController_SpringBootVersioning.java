package com.munte.restful_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController_SpringBootVersioning {

/*    URI versioning - Twitter */

//    @GetMapping(value = "/{version}/person-sbi", version = "1.0.0")
//    public PersonV1 getFirstVersionOfPerson() {
//        return new PersonV1("SBI v1 Bob Charlie");
//    }
//
//    @GetMapping(value = "/{version}/person-sbi", version = "2.0.0")
//    public PersonV2 getSecondVersionOfPerson() {
//        return new PersonV2(new Name("SBI v2 Bob", "Charlie"));
//    }



//    Request Parameter versioning - Amazon
//    @GetMapping(path = "/person-sbi", version = "1.0.0")
//    public PersonV1 getFirstVersionOfPerson_RequestParameter() {
//        return new PersonV1("SBI v1 Bob Charlie - params");
//    }
//
//    @GetMapping(path = "/person-sbi", version = "2.0.0")
//    public PersonV2 getSecondVersionOfPerson_RequestParameter() {
//        return new PersonV2(new Name("SBI v2 Bob - params", "Charlie - params"));
//    }


}
