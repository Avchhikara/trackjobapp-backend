package com.trackjobapp.TrackJobApp.Controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.trackjobapp.TrackJobApp.model.Application;
import com.trackjobapp.TrackJobApp.service.IApplicationService;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class Controller {

    @Autowired
    private IApplicationService applicationService;

    @GetMapping("/")
    public String Home() {
        log.info("Serving homepage");
        return "<h1>Server is working</h1>";
    }

    @GetMapping("/entries")
    public String showVal() {
        List<Application> applications = applicationService.getAll();
        Gson gson = new GsonBuilder().create();
        return gson.toJson(applications);
    }

    @PostMapping("/create")
    public String createEntry(@RequestBody Application application) {
        var isSaved = applicationService.save(application);
        return isSaved ? "Save Success" : "Save FAILED!";
    }
}
