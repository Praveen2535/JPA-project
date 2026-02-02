package com.DataJpa.JpaProject;

import com.DataJpa.JpaProject.model.Video;
import com.DataJpa.JpaProject.repository.AuthorRepository;
import com.DataJpa.JpaProject.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaProjectApplication.class, args);
	}

	public CommandLineRunner commandLineRunner(
			AuthorRepository repository,
			VideoRepository videorepository
	){
		return args -> {
			var video = Video.builder()
					.name("Test Video")
					.length(5)
					.build();
			videorepository.save(video);

		};
	}

}
