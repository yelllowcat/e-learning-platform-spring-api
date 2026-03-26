package com.spring.jpa.lectures;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.spring.jpa.resources.Resource;
import com.spring.jpa.sections.Section;
import jakarta.persistence.*;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Lecture {

    @Id
    @GeneratedValue
    private Integer id;


    private String name;

    @OneToOne(
    )
    @JoinColumn(name ="resource_id")
    private Resource resource;

    @ManyToOne
    @JoinColumn(name = "section_id")
    @JsonBackReference
    private Section section;
}
