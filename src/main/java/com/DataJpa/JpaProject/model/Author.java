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
@Table(name = "Author_Tbl")
public class Author extends BaseEntity{



    @Column(
            name = "F_name",
            nullable = false,
            length = 35

    )
    private String firstName;
    private String lastName;
    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private int age;

    @ManyToMany
    private List<Author>  authors;

}
