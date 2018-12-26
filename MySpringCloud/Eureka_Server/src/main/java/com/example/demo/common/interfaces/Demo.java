package com.example.demo.common.interfaces;

import java.lang.annotation.*;

/**
 * Created by 45700 on 2018/10/10.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Demo {

    String demo();
}
