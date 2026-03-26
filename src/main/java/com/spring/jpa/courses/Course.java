package com.spring.jpa.courses;

import com.spring.jpa.authors.Author;
import com.spring.jpa.sections.Section;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Course {

    @Id
    @GeneratedValue
    private Integer id;

    private String title;

    private String description;

    @ManyToMany
    @JoinTable(
            name = "authors_courses",
            joinColumns = {
                    @JoinColumn(
                            name = "course_id"
                    ),
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "author_id"
                    )
            }
    )
    private List<Author> authors;

    @OneToMany(mappedBy = "course")
    private List<Section> sections;
}
