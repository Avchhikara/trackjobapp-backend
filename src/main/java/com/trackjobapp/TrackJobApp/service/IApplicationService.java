package com.trackjobapp.TrackJobApp.service;

import com.trackjobapp.TrackJobApp.model.Application;

import java.util.List;

public interface IApplicationService {
    List<Application> getAll();
    Boolean save(Application application);
}
