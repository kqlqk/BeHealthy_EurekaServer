package me.kqlqk.behealthy.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class, args);
    }
}
