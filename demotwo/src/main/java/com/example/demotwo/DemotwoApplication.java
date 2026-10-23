package com.example.demotwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DemotwoApplication {

	
	MovieRepo movierepo;

	public DemotwoApplication(MovieRepo movierepo){
		this.movierepo=movierepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemotwoApplication.class, args);
	
	}

	@PostConstruct
	public void run(){


		System.out.println("creating the movie****************************************");

		movierepo.createMovie(new Movie(null,"dvds","dsvdsv",89,98,"adfdsa"));


		System.out.println("display");

		System.out.println(movierepo.getAllmovies());
		
		
		System.out.println(movierepo.getById(3L));
		System.out.println(movierepo.deleteByid(3L));
		System.out.println(movierepo.getAllmovies());




	}

}
