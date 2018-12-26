package com.example.demo.common.controller;

import com.example.demo.common.interfaces.Demo;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 45700 on 2018/10/10.
 */
@RestController
public class DemoController {

    @Demo(demo = "测试")
   @RequestMapping("/demo")
    public  void  demo(){

    }

}
