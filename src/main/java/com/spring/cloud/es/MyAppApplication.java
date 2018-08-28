package com.spring.cloud.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication()
public class MyAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyAppApplication.class, args);
		System.out.println("myapp started ...");
	}
	
	@Bean
	public RestTemplate getTemplate(){
		return new RestTemplate();
	}
}