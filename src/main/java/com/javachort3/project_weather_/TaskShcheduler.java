package com.javachort3.project_weather_;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class TaskShcheduler implements CommandLineRunner {


    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            logger.info("Application started with command-line arguments: {} . " +
                    "\n To kill this application, press Ctrl + C.", Arrays.toString(args);
        };
    }
}
