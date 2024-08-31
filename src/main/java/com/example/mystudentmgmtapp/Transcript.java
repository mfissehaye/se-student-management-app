package com.example.mystudentmgmtapp;

import jakarta.persistence.*;

@Entity
public class Transcript {

    // Primary key with auto-generated value
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transcriptId;

    @Column(nullable = false)
    private String degreeTitle;

    // Default constructor for JPA
    public Transcript() {}

    // Constructor
    public Transcript(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    // Getters and Setters
    public Long getTranscriptId() {
        return transcriptId;
    }

    public void setTranscriptId(Long transcriptId) {
        this.transcriptId = transcriptId;
    }

    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }
}
