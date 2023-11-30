package com.leojung.leoprojectboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class LeoProjectBoardApplication {

    public static void main(String[] args) {

        SpringApplication.run(LeoProjectBoardApplication.class, args);
    }

}
