package com.example.demo.common.rocketmq;

import java.io.Serializable;

/**
 * Created by 45700 on 2018/10/8.
 */
public interface ErrorCode  extends Serializable {

    /**
     * 错误码
     * @return
     */
    String getCode();
    /**
     * 错误信息
     * @return
     */
    String getMsg();
}
