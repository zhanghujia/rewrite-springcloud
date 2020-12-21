package com.example.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 10696
 * @since 2020/12/21 10:46
 */

@RestController
public class ConfigClientController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.applications.name}")
    private String applicationName;

    @GetMapping("/config")
    public String config() {
        String content = "app-Name: " + applicationName + "--,port: " + port;
        System.out.println(content);
        return content;
    }

}
