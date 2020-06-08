package com.itlize.eureka1;

import com.itlize.eureka1.repository.MovieTable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.HashMap;
import java.util.Map;


@SpringBootApplication
@EnableEurekaClient
public class Eureka1Application {


	public static MovieTable movieTable;
	public static void main(String[] args) {
		movieTable = new MovieTable();
		SpringApplication.run(Eureka1Application.class, args
		);
	}

}
