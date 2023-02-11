package com.hello.individualAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class IndividualAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndividualAssignmentApplication.class, args);
	}

}
