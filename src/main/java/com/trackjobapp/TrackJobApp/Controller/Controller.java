package com.trackjobapp.TrackJobApp.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {

    @GetMapping
    public String Home() {
        log.info("Serving homepage");
        return "<h1>Hello</h1>";
    }
}
