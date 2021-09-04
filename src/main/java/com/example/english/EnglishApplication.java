package com.example.english;

import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.io.IOException;


@SpringBootApplication
public class EnglishApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnglishApplication.class, args);
	}

}
