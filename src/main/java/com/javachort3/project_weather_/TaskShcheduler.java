package com.javachort3.project_weather_;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
public class TaskScheduler implements CommandLineRunner {


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTxemplate) throws Exception {
        return args -> {
            logger.info("Application started with command-line arguments: {} . " +
                    "\n To kill this application, press Ctrl + C.", Arrays.toString(args));
        };
    }
}
