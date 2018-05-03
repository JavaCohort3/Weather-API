package com.javachort3.project_weather_;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import org.slf4j.Logger;

@EnableScheduling
@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	private static RestTemplateBuilder builder = new RestTemplateBuilder();

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public static RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	@Bean
	public static CommandLineRunner consumeAPI() throws Exception {
		RestTemplate restTemplate = restTemplate(builder);
		return args -> {
			Query query = restTemplate.getForObject(
					"https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22wilmington%2C%20de%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys", Query.class);
			log.info(query.toString());
		};
	}
}