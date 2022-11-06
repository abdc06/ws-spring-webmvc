package me.abdc.config;

import me.abdc.WebAppInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackageClasses = WebAppInitializer.class, excludeFilters = @ComponentScan.Filter(Controller.class))
public class AppConfig {
}
