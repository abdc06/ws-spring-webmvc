package me.abdc.web;

import me.abdc.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @Autowired
    ApplicationContext context;

    @GetMapping("/simple")
    public String simple() {
        SimpleService simpleService = context.getBean(SimpleService.class);
        return simpleService.getName();
    }
}
