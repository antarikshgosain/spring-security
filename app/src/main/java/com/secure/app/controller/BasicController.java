package com.secure.app.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class BasicController {

    @GetMapping(value = "/")
    public String testHello(HttpServletRequest httpServletRequest){
        log.info("Endpoint Called - testHello()");
        return "Project says Hello - Test Endpoint Working for " +httpServletRequest.getSession().getId();
    }
}
