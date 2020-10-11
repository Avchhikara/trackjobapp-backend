package com.trackjobapp.TrackJobApp.model;

import lombok.Value;

@Value
public class AddApplication {
    private String role;
    private String companyName;
    private String appliedOn;
    private String stage;
}
