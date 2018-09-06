package com.example.demo.controller;

import com.example.demo.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 45700 on 2018/8/22.
 */

@RestController
public class FeignDemoController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "demo")
    public String demo(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne( name );
    }
}
