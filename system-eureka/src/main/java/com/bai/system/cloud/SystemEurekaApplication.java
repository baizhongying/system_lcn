package com.bai.system.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SystemEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemEurekaApplication.class, args);
    }
}
