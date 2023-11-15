package com.nighthawk.mvc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration // Scans Application for ModelInit Bean, this detects CommandLineRunner
public class ModelInit {  

    @Bean
    CommandLineRunner run() {  // The run() method will be executed after the application starts
        return args -> {

        };
    }
}

