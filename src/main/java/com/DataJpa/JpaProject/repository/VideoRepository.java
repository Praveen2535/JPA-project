package com.DataJpa.JpaProject.repository;

import com.DataJpa.JpaProject.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {
}
