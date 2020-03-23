package com.danileyko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaPrimaryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaPrimaryServerApplication.class, args);
    }
}
