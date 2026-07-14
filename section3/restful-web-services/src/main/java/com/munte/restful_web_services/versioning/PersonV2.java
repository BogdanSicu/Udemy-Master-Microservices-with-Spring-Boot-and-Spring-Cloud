package com.munte.restful_web_services.versioning;

import java.util.StringJoiner;

public class PersonV2 {

    private Name name;

    public PersonV2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PersonV2.class.getSimpleName() + "[", "]")
                .add("name=" + name)
                .toString();
    }
}
