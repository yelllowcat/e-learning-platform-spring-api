package com.spring.jpa.resources;

import com.spring.jpa.lectures.Lecture;
import jakarta.persistence.*;
import lombok.*;

import java.net.URL;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Resource {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int size;

    private String url;

    @OneToOne()
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}
