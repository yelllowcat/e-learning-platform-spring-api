package com.spring.jpa.lectures;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Lecture {

    @Id
    private Integer id;

    @Setter
    @Getter
    private String name;

}
