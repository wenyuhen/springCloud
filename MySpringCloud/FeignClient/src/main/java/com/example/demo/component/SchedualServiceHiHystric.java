package com.example.demo.component;

import com.example.demo.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by 45700 on 2018/8/27.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+ name;
    }
}
