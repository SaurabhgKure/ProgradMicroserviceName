package com.Quess.MicroServiceDemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("firstmicroserviceapp")
public class NameConfiguration {
    public NameConfiguration() {
    }

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public NameConfiguration(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
