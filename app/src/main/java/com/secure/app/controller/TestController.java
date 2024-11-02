package com.secure.app.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class TestController {

    @GetMapping(value = "/test")
    public String testHello(){
        log.info("Endpoint Called - testHello()");
        return "Project says Hello - Test Endpoint Working";
    }
}
