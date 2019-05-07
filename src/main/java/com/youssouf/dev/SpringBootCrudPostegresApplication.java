package com.youssouf.dev;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories("com.youssouf.dev.repository")
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({"com.youssouf.dev"})

public class SpringBootCrudPostegresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudPostegresApplication.class, args);
	}

}
