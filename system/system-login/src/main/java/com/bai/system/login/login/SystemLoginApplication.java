package com.bai.system.login.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableFeignClients //开启发现服务功能
@ComponentScan(basePackages = {"com.bai.system"})
public class SystemLoginApplication {

    public static void main(String[] args) {

        SpringApplication.run(SystemLoginApplication.class, args);
    }
}
