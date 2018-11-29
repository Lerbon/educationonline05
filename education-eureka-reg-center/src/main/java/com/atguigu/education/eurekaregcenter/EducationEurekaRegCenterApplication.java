package com.atguigu.education.eurekaregcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EducationEurekaRegCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EducationEurekaRegCenterApplication.class, args);
    }
}
