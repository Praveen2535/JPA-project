package com.DataJpa.JpaProject.repository;

import com.DataJpa.JpaProject.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
