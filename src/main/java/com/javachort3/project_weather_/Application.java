package com.javachort3.project_weather_;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
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
    @Scheduled(fixedRate = 30000)
	public static CommandLineRunner consumeAPI() throws Exception {
		RestTemplate restTemplate = restTemplate(builder);
		return args -> {
			Weather weather = restTemplate.getForObject(
					"https://query.yahooapis.com/v1/public/yql?q=select+*+from+weather.forecast+where+woeid+in+(select+woeid+from+geo.places(1)+where+text=\"wilmington, +de\")&format=json", Weather.class);
			log.info(weather.toString());
		};
	}
}