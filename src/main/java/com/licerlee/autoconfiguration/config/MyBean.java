package com.licerlee.autoconfiguration.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyBeanProperties.class)
public class MyBean {

    private final MyBeanProperties properties;

    public MyBeanProperties getProperties() {
        return properties;
    }

    public MyBean(MyBeanProperties properties) {
        this.properties = properties;
    }
}
