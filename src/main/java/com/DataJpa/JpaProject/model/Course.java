package com.DataJpa.JpaProject.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
public class Course extends BaseEntity {

    private String name;

    private String description;

    @ManyToMany
    @JoinTable(
            name = "author_courses",
            joinColumns = {
                   @JoinColumn(name = "crs_id")
            },

            inverseJoinColumns = {
                    @JoinColumn(name = "author_id")
            }

    )
    private List<Course> courses;


    @OneToMany(mappedBy = "course")
    private List<Section> sections;


}
