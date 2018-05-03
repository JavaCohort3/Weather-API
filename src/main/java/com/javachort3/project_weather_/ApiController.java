package com.javachort3.project_weather_;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    String x = null;

    @RequestMapping
    public String makeHTML() {
        return "";
    }

}
