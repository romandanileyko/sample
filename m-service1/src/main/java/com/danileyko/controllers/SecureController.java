package com.danileyko.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/secure")
public class SecureController {

    @GetMapping
    public String getSecure() {
        return "Secure!";
    }
}
