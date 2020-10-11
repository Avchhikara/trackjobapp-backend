package com.trackjobapp.TrackJobApp.repository;

import com.trackjobapp.TrackJobApp.model.Application;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
