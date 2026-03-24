package com.spring.jpa.courses;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Course {

    @Id
    private Integer id;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String description;
}
