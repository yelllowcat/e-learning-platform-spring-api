package com.spring.jpa.sections;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.spring.jpa.courses.Course;
import com.spring.jpa.lectures.Lecture;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Section {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String sectionOrder;

    @OneToMany(
            mappedBy = "section",
            cascade = CascadeType.DETACH
    )
    @JsonManagedReference
    private List<Lecture> lectures;


    @ManyToOne
    @JoinColumn(
            name = "course_id"
    )
    private Course course;

}
