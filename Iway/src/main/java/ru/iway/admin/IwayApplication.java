package ru.iway.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"ru.iway.entity"})
public class IwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(IwayApplication.class, args);
	}

}
