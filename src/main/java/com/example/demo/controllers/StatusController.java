package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.resources.StatusResource;

@RestController
public class StatusController {

    @GetMapping("api/status")
    public StatusResource check(){
        return new StatusResource("ok");
    }
}
