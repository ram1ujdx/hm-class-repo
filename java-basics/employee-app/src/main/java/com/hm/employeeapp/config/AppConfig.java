package com.hm.employeeapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.hm.employeeapp"})
@PropertySource("app.properties")
public class AppConfig {

}
