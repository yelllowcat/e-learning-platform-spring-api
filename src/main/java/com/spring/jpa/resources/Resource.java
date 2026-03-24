package com.spring.jpa.resources;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.net.URL;

@Entity
public class Resource {

    @Id
    private Integer id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String size;

    @Getter
    @Setter
    private URL url;
}
