package me.abdc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages = "me.abdc", includeFilters = @ComponentScan.Filter(Controller.class))
public class WebConfig {
}
