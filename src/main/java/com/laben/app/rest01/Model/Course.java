package com.laben.app.rest01.Model;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "Courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "code", length = 30, nullable = false)
    private String code;

    @Column(name = "description", nullable = true)
    @Type(type = "text")
    private String description;



}
