package com.itlize.eureka2;

import com.itlize.eureka2.repository.RatingTable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
public class Eureka2Application {

	public static RatingTable ratingTable;
	public static void main(String[] args)
	{
		ratingTable = new RatingTable();
		SpringApplication.run(Eureka2Application.class, args);
	}

}
