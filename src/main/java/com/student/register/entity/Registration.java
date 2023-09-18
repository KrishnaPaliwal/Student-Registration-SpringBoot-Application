package com.student.register.entity;

import javax.persistence.*;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Student student;
    
    @ManyToOne
    private Exam exam;
    
    // Add other fields, getters, and setters
}