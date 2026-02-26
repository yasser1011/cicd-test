package com.pipelines.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/api/v1/test")
public class DemoController {

    @GetMapping
    public String testString() {
        return "Hello Test";
    }
}
