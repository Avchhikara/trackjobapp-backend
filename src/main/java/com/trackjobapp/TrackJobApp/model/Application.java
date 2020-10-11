package com.trackjobapp.TrackJobApp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "applications")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String company_name;
    private Date applied_on;
    private Date created_on = new Date();
    private String stage;
}
