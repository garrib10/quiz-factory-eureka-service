package com.company.quizfactoryeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QuizFactoryEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizFactoryEurekaServiceApplication.class, args);
	}

}
