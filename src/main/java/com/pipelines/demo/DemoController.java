package com.pipelines.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/api/v1/test")
public class DemoController {
    @Value("${testvalue1}")
    private String envVariable1;
    @Value("${testvalue2}")
    private String envVariable2;


    @GetMapping
    public String testString() {
        return "Hello Test";
    }

    @GetMapping("/env")
    public String testEnvVariable() {
        return "Environment Variable Value 1 " + envVariable1 + " Environment Variable Value 2 " + envVariable2;
    }
}
