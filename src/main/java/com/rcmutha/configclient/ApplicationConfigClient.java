package com.rcmutha.configclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class ApplicationConfigClient {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfigClient.class, args);
    }
}
@RefreshScope
@RestController
class MessageRestController {

    @Value("${auther.name:Hello Unknown}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }
}