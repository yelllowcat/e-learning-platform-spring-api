package com.spring.jpa;

import com.spring.jpa.authors.Author;
import com.spring.jpa.authors.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	//@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository
	){
	return args -> {
		var author = Author.builder()
				.firstName("david")
				.lastName("gonzalez")
				.age(21)
				.email("david@gmail.com")
				.build();
		repository.save(author);
	};
	};

}
