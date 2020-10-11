package com.trackjobapp.TrackJobApp.service;

import com.trackjobapp.TrackJobApp.model.Application;
import com.trackjobapp.TrackJobApp.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService implements IApplicationService {

    @Autowired
    private ApplicationRepository repository;

    @Override
    public List<Application> getAll() {
        return (List<Application>) repository.findAll();
    }

    @Override
    public Boolean save(Application application) {
        return repository.save(application) != null;
    }
}
