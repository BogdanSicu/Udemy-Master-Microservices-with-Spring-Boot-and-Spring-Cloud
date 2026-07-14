package com.munte.restful_web_services.versioning;

public class PersonV1 {

    private String fullName;

    public PersonV1(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Person{" + "fullName='" + fullName + '\'' +
                '}';
    }
}
