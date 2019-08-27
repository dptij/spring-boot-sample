package com.mycompany.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SampleLendingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleLendingApplication.class, args);
    }

}
