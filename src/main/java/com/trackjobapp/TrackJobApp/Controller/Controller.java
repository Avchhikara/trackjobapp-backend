package com.trackjobapp.TrackJobApp.Controller;

//import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping
    public String Home() {
        return "<h1>Hello</h1>";
    }
}
