package com.secure.app.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ResourceController {

    @GetMapping(value = "/")
    public String testHello(){
        return ("<h1>Everyone is welcome</h1>") ;
    }

    @GetMapping(value = "/user")
    public String userHello(){
        return ("<h1>Hello User</h1>") ;
    }

    @GetMapping(value = "/admin")
    public String adminHello(){
        return ("<h1>Hello Admin</h1>") ;
    }
}
