package com.wzx.it.securityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SecurityserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityserviceApplication.class, args);
    }

}
