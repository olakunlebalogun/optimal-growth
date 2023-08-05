package com.olakunle.organizationservice.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "example")
@Component
public class ServiceConfig {
    private String property;

    public String getProperty() {
        return property;
    }

    //Note: This important when the property file needs to migrate/change from default to profile-based configuration.
    public void setProperty(String property) {
        this.property = property;
    }

}
