package com.example.demo.thread.threadLocal;

import java.util.Date;

/**
 * @author huyd
 * @date 2019/4/4
 */
public class InitialThreadLocal extends ThreadLocal {

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
