package com.spring.jpa.authors;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Author {

    @Id
    private Integer id;

    @Getter
    @Setter
    private String first_name;

    @Getter
    @Setter
    private String last_name;


}
