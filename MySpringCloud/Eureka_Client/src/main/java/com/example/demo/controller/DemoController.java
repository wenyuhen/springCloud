package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 45700 on 2018/8/15.
 */
@RestController
public class DemoController {
    @Value("${server.port}")
    String port;


    @RequestMapping("/hi")
    public String demo(){
        System.out.println(port);

        return "demo eureka_client : " + port;
    }
}
